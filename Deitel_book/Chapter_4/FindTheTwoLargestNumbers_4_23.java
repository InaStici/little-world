package exercises;
import java.util.Scanner;
public class FindTheTwoLargestNumbers_4_23 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int number;
		int largest1 = 0;
		int largest2 = 0;
		
//		System.out.print("Enter number:");
//		number = input.nextInt();
		
		while (counter < 10) {
			
			
			System.out.print("Enter number:");
			number = input.nextInt();
			
			if (number < 0)
				System.out.println("Negative numbers not allowed!");
			
			if (largest1 < number) {
				largest2 = largest1;
				largest1 = number;		
			} else {
			
			if (largest2 < number) 
				largest2 = number;
			}
			
			
			counter +=1;
			
		}
		System.out.println();
		
		System.out.println("You entered " + counter + " numbers");
		System.out.println("The first largest number is: " + largest1);
		System.out.println("The second largest number is: " + largest2);

	}

}
