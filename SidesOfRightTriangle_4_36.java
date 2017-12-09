package exercises;

import java.util.Scanner;

public class SidesOfRightTriangle_4_36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter 3 nonzero numbers:");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		while (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Please re-enter 3 nonzero numbers:");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
		}

		if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {

			System.out.println("Can form a right triangle");

		} else {
			System.out.println("Cannot form a right triangle");
		}

	}

}
