package selfexercises;

import java.util.Scanner;

public class SalaryCalculator_4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String employee;
		double hourlyRate;
		double hoursWorked;
		double salary = 0;

		System.out.print("Enter employee's name: ");
		employee = input.nextLine();
		System.out.print("Enter number of worked hours: ");
		hoursWorked = input.nextDouble();
		System.out.print("Enter hourly rate: ");
		hourlyRate = input.nextDouble();

		if (hoursWorked < 0)
			System.out.println("Error!");
		if (hourlyRate < 0)
			System.out.println("Error!");
		if (hoursWorked <= 8) {
			salary = hoursWorked * hourlyRate;
			System.out.printf("Employee's salary is: %.2f%n", salary);

		} else {
			salary = (hourlyRate * 8) + (hoursWorked - 8) * (1.5 * hourlyRate);
			System.out.printf("Employee's salary is: %.2f%n", salary);

		}

	}

}
