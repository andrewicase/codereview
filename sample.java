// Sample Java program to do basic array manipulation
import java.util.*;

class Test
{
	/**
	 * @param a  the array to evaluate
	 * @return   the arrithmetic mean of the array
	 */
	public static double getMean(int a[]) {
		size = a.Length;
		int sum = 0;
		for (int i = 0; i < size; i++)
			sum += a[i];

		return (double)sum / (double)size;
	}
	// Discus: Could this be optimized at all?

	/**
	 * @param a  the array to evaluate
	 * @return   the median value (the middle or average of middle values)
	 */
	public static double getMedian(int a[]) {
		Arrays.sort(a);
		return a[n/2];
		// What's the problem with this code?
		// Is the array sorted in place or do we get a new copy?
		// Do you know if it's a deep copy or shallow copy?
		// What's the big-O analysis of sort?
	}

	/**
	 * @param a  the array to evaluate
	 * @return   the largest value in the array
	 */
	public static double getMax(int a[]) {
		size = a.Length;
		Arrays.sort(a);
		return a[size]
	}

	/**
	 * @param a  the array to evaluate
	 * @return   the smallest value in the array
	 */
	public static double getMin(int a[]) {
		// TODO: Write this code without sorting the array
	}

	/**
	 * @param a  the array to evaluate
	 * @return   an array containing the lowest and highest values of array
	 */
	public static double[] getRange(int a[]) {
		// TODO: Write this code
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
	}

}

