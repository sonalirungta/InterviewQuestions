/*
 * Given an array of positives, 0’s and negatives, change the array to make sure all the negatives come first, 
 * then the 0’s and then positive’s. This is also known as the Dutch flag problem. 
 * Here we do it in a single pass of the array.
 */

package arrays;

/* Two pass / simpel  method: 
 * 1. Take negatives to one end, positives and zeros to the other end.
 * 2. Repeat for positives and zeros
 */

/* One pass / Dutch flag method (implemented below)
 * 1. Take three pointers, first, second, and third. 
 * 2. Move second from beginning to end, swapping negative numbers with first and positive numbers with third.
 */
public class DucthNationalFlag {
	public static void reArrange(Integer[] A) {
		int first = 0, second = 0, third = A.length - 1;
		while (second <= third) {
			if (A[second] < 0) {
				Utilities.swap(A, first++, second++);
			} else if (A[second] > 0) {
				Utilities.swap(A, second, third--);
			} else {
				second++;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] A = { 0, 1, 5, -6, -2, 7, 8, -11, 0 };
		reArrange(A);
		Utilities.printArray(A);

	}

}
