package exercises;

import java.util.Scanner;

public class FindTheSmallestValue_5_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number;
		int smallest = Integer.MAX_VALUE;
		int nrVal;
		
		System.out.print("Enter number of values: ");
		nrVal = input.nextInt();
		
		System.out.print("Enter " +nrVal+ " numbers: ");
		
		while (counter < nrVal) {
			number = input.nextInt();		
			if (number < smallest) {
				smallest = number;
			} 
			
			counter +=1;
			
		}
		System.out.println();
		
		System.out.println("You entered " + counter + "numbers");
		System.out.println("The smallest number is: " + smallest);
		

	}

}
