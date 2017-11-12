package exercises;
import java.util.Scanner;
public class Comparison {

public static void main(String[] args) {
		
		// create a Scanner to obtain input from the command window
				Scanner input = new Scanner(System.in);
				
				int number1;
				int number2;
								
				System.out.print("Enter first integer:");
				number1 = input.nextInt();//read first number from user
				
				System.out.print("Enter second integer:");
				number2 = input.nextInt();
				
				if (number1 >= number2)
					System.out.print(number1 + " is larger");
				
				if (number1 == number2)
					System.out.print("These numbers are equal");
				
				if (number1 <= number2)
					System.out.print(number2 + " is larger");
}
}
