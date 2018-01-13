package exercises;

import java.util.Scanner;

public class SidesOfTriangle_4_35 {

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

		if (a + b >= c && a + c >= b && b + c >= a) {

			System.out.println("Triangle can be formed");

		} else {
			System.out.println("Triangle cannot be formed");
		}

	}

}
