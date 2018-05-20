package test1;

import java.util.Scanner;

public class FindMinMaxInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array1 = { 77, 2, 33, 4, 5, 105, 22 };
		int[][] array2 = { { 11, 0 }, { 3, 14 }, { 5, 46 } };

		System.out.println("Minimum in one-dimensional array is " + findMinIn1dArray(array1));
		System.out.println();
		System.out.println("Maximum in one-dimensional array is " + findMaxIn1dArray(array1));
		System.out.println();
		System.out.println("Minimum in two-dimensional array is " + findMinIn2dArray(array2));
		System.out.println();
		System.out.println("Maximum in two-dimensional array is " + findMaxIn2dArray(array2));

	}

	public static int findMinIn1dArray(int[] arr) {

		int minimum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
			}

		}
		return minimum;
	}

	public static int findMaxIn1dArray(int[] arr) {

		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}

		}
		return maximum;
	}

	public static int findMinIn2dArray(int[][] arr2) {
		int minimum = arr2[0][0];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j] < minimum) {
					minimum = arr2[i][j];
				}

			}
		}
		return minimum;

	}

	public static int findMaxIn2dArray(int[][] arr2) {
		int maximum = arr2[0][0];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j] > maximum) {
					maximum = arr2[i][j];
				}

			}
		}
		return maximum;

	}
}
