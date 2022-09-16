#!/bin/bash

usermod -aG sshusers null
sed -i 's/PermitRootLogin yes/PermitRootLogin no/' /etc/ssh/sshd_config
systemctl restart sshd


if [[ -z "$(partprobe -ds /dev/sdb)" ]]; then
    parted --script /dev/sdb mklabel gpt mkpart primary xfs 0% 100%
    mkfs.xfs /dev/sdb1
fi

echo "/dev/sdb1 /usr/local/share xfs defaults 0 0" >> /etc/fstab

mkdir -p /usr/local/share
touch /usr/local/share/share-not-mounted
mount /usr/local/share

dirs=(repositories repo-dev repo-prod)
for dir in ${dirs[@]}; do
    mkdir -p "/usr/local/share/$dir"
    chmod 715 "/usr/local/share/$dir"
    echo "/usr/local/share/$dir 192.0.0.0/24(rw,all_squash,anonuid=0,anongid=0)" >> /tmp/exports
done

column -t /tmp/exports > /etc/exports
rm /tmp/exports
systemctl restart nfs

