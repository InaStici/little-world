package exercises;

import java.util.Scanner;

public class TemperatureConversions_6_22 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int celsius;
		int fahrenheit;

		System.out.println("If you want to enter Celsius degrees and convert to Fahrenheit, type 1");
		System.out.println("If you want to enter Fahrenheit degrees and convert to Celsius, type 2");
		int str = in.nextInt();

		System.out.print("Enter degrees: ");
		int degree = in.nextInt();

		switch (str) {
		case 1:
			fahrenheit = convertToFahrenheit(degree);
			System.out.printf("Converted dergees from Celsius to Fahrenheit: %d%n", fahrenheit);
			break;
		case 2:
			celsius = convertToCelsius(degree);
			System.out.printf("Converted degrees from Fahrenheit to Celsius: %d%n", celsius);
			break;
		}
	}

	public static int convertToCelsius(int degree) {
		int celsius = (int) (5.0 / 9.0 * (degree - 32));
		return celsius;
	}

	public static int convertToFahrenheit(int degree) {
		int fahrenheit = (int) (9.0 / 5.0 * degree + 32);
		return fahrenheit;
	}

}
