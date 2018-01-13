package exercises;

import java.util.Scanner;

public class HypotenuseCalculation_6_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double side1;
		double side2=1;
		
		System.out.print("Enter side1 of triangle: ");
		 side1 = sc.nextDouble();

		
			while (side1 <= 0) {
				System.out.println("Enter side1 greater than 0");
				side1 = sc.nextDouble();
			}

			System.out.print("Enter side2 of triangle: ");
			 side2 = sc.nextDouble();

			while (side2 <= 0) {
				System.out.println("Enter side1 greater than 0");
				side2 = sc.nextDouble();
			}
		

		double hypot = hyp(side1, side2);

		System.out.println();
		System.out.print("Hypotenuse of triangle is " + hypot);
	}

	public static double hyp(double s1, double s2) {

		double hypotenuse = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));

		return hypotenuse;
	}

}
