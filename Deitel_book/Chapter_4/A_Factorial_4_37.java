package exercises;

import java.util.Scanner;

public class A_Factorial_4_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int factorial = 1;
		
		System.out.print("Enter a nonnegative number to calculate the factorial: ");
		int n = input.nextInt();
		
		while (n < 0) {
			System.out.print("Re-enter a nonnegative number to calculate the factorial: ");
			n = input.nextInt();
		}
		
		for (int i=n; i>1; i--) {
			factorial *= i; 
		}
		System.out.print("The factorial of " + n + " is " + factorial);

	}

}
