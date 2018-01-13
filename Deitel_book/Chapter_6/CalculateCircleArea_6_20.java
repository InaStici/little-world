package exercises;

import java.util.Scanner;

public class CalculateCircleArea_6_20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double area = 0;

		System.out.println("Enter radius of the circle:");
		double radius = in.nextDouble();

		while (radius <= 0) {
			System.out.println("Enter positive raius");
			radius = in.nextDouble();
		}

		area = circleArea(radius);
		System.out.printf("The area of the circle is: %2f", area);

	}

	private static double circleArea(double radius) {

		double ar = Math.PI * Math.pow(radius, 2);

		return ar;
	}

}
