// Sample Java program to do basic array manipulation
import java.util.*;

class ArrayPP
{
	/**
	 * @param a  array to evaluate
	 * @return   the arithmetic mean of the array
	 */
	public static double getMean(int a[]) {
		size = a.Length;
		int sum = 0;
		for (int i = 0; i < size; i++)
			sum += a[i];

		return (double)sum / (double)size;
		// Discus: Could this be optimized at all?
	}

	/**
	 * @param a  array to evaluate
	 * @return   the median value (the middle or average of middle values)
	 */
	public static double getMedian(int a[]) {
		Arrays.sort(a);
		if (size%2 != 0)
			return a[size/2];
		return a[size/2] + a[size/2-1]			
		// What all is wrong with this code?
		// Is the array sorted in place or do we get a new copy?
		//  you know if it's a deep copy or shallow copy?
		// What's the big-O analysis of sort?
	}

	/**
	 * @param a  array to evaluate
	 * @return   the largest value in the array
	 */
	public static double getMax(int a[]) {
		size = a.Length;
		Arrays.sort(a);
		return a[size]
		// Discuss: any function side-effects?
	}

	/**
	 * @param a  array to evaluate
	 * @return   the smallest value in the array
	 */
	public static double getMin(int a[]) {
		// Discuss: Write this code without sorting the array/causing side-effects?
	}

	/**
	 * @param a  the array to evaluate
	 * @return   an array containing the lowest and highest values of array
	 */
	public static double[] getRange(int a[]) {
		// Discuss: Write this code
	}

	/**
	 * @param a  the array to copy
	 * @return   Creates a deep copy of the array
	 */
	public static double[] Copy(int a[]) {
		// Discuss: Write this code
	}

	/**
	 * Driver code
	 */
	public static void main(String args[]) {
		int a[] = { 7, 1, 2, 4, 6, 5 };
		System.out.println("Mean: " + getMean(a));
		System.out.println("Median: " + getMedian(a));
		System.out.println("Min: " + getMin(a));
		System.out.println("Max: " + getMean(a));
		int range[] = getRange(a);
		System.out.println("Range: " + range[0] + "-" + range[1]);
		// Discuss: Any bugs/typos, etc?
		// Discuss: Possible optimizations?
	}

}

