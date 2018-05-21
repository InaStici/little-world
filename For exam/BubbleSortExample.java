package test1;

public class SortingArrayExample {

	public static void main(String[] args) {

		int[] arr = { 3, 60, 35, 2, 45, 320, 5 };
		int[] arr1 = { 3, 60, 35, 3, 2, 43, 11, 58 };
		int[] arr2 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		int[] arr3 = { 110, 2, 31, 14, 5, 62, 17, 32 };
		int[] arr4 = { 45, 12, 3, 89, 120, 45, 66, 137, 5, 99, 38, 50, 100, 75, 66, 48, 39 };
		int[] arr5 = {89, 120, 45, 66, 137, 5, 99, 38, 50, 100};
		
		System.out.println("Array After Bubble Sort");
		bubbleSort(arr);// sorting array elements using bubble sort
		System.out.println();
		System.out.println();
		System.out.println("Array After Selection Sort");
		selectionSort(arr1);// sorting array elements using selection sort
		System.out.println();
		System.out.println();
		System.out.println("Array After Insertion Sort");
		insertionSort(arr2);
		System.out.println();
		System.out.println();
		System.out.println("Array After Shaker Sort");
		shakerSort(arr3);
		System.out.println();
		System.out.println();
		System.out.println("Array After Quick Sort");
		quicksort(arr4, 0, 8);
		System.out.println();
		System.out.println();
		System.out.println("Array After Shell Sort");
		shellSort(arr5);

	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void shakerSort(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			boolean swapped = false;
			for (int j = i; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					swapped = true;
				}
			}
			for (int j = array.length - 2 - i; j > i; j--) {
				if (array[j] > array[j - 1]) {
					int tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void quicksort(int[] array, int left, int right) {
		if (left < right) {
			int boundary = left;
			for (int i = left + 1; i < right; i++) {
				if (array[i] > array[left]) {
					swap(array, i, ++boundary);
				}
			}
			swap(array, left, boundary);
			quicksort(array, left, boundary);
			quicksort(array, boundary + 1, right);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void swap(int[] array, int left, int right) {
		int tmp = array[right];
		array[right] = array[left];
		array[left] = tmp;
	}

	public static int[] shellSort(int[] array) {
		int gap = array.length / 2;
		while (gap > 0) {
			for (int i = 0; i < array.length - gap; i++) { // modified insertion sort
				int j = i + gap;
				int tmp = array[j];
				while (j >= gap && tmp > array[j - gap]) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = tmp;
			}
			if (gap == 2) { // change the gap size
				gap = 1;
			} else {
				gap /= 2.2;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}

}
