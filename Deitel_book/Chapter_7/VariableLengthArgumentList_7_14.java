package exercises;

public class VariableLengthArgumentList_7_14 {

	public static void main(String[] args) {

		int[] arr1 = {3, 12, 20};
		int[] arr2 = {3, 12, 20, 4, 78};
		int[] arr3 = {3, 12, 20, 13, 15, 21, 55};
		System.out.println("Product of 3 numbers: " + calculateProduct(arr1));
		System.out.println("Product of 5 numbers: " + calculateProduct(arr2));
		System.out.println("Product of 7 numbers: " + calculateProduct(arr3));
		
	}
	
	public static  int calculateProduct(int... variables) {
		int prod=1;
		for (int var : variables) {
			prod = prod * var;
		}
		return prod;
		
	}

}
