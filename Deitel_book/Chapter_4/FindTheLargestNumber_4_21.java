package exercises;
import java.util.Scanner;
public class FindTheLargestNumber_4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number;
		int largest = 0;
		
		System.out.print("Enter number:");
		number = input.nextInt();
		
		while (counter < 10) {
			System.out.print("Enter number:");
			number = input.nextInt();
			
			if (largest < number) {
				largest = number;
			} 
			
			counter +=1;
		}
		System.out.println();
		
		System.out.println("You entered " + counter + "numbers");
		System.out.println("The largest number is: " + largest);

	}

}
