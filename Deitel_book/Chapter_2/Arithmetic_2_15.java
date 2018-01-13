package exercises;
import java.util.Scanner;
public class Arithmetics {

	public static void main(String[] args) {
		
		// create a Scanner to obtain input from the command window
				Scanner input = new Scanner(System.in);
				
				int number1;
				int number2;
				int sum;
				int diff;
				int prod;
				double div;
				
				System.out.print("Enter first integer:");
				number1 = input.nextInt();//read first number from user
				
				System.out.print("Enter second integer:");
				number2 = input.nextInt();
				
				sum = number1+number2;
				System.out.println("Sum of the numbers is:");
				System.out.printf("%d%n", sum);
			
				diff = number1-number2;
				System.out.println("Difference of the numbers is:");
				System.out.printf("%d%n", diff);
				
				prod = number1*number2;
				System.out.println("Product of the numbers is:");
				System.out.printf("%d%n", prod);
				
				div = (double) number1/number2;
				System.out.println("Quotient of the numbers is:");
				System.out.printf("%f%n", div);
	}

}
