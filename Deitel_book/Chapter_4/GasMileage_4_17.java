package exercises;

import java.util.Scanner;

public class GasMileage_4_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int milesDriven = 0;
		int gallonsUsed = 0;
		double mpg = 0;
		double averageMpg = 0;
		int tripCounter = 0;
		double totalMpg = 0;

		
		System.out.print("Enter miles driven or 0 to quit:");
		milesDriven = input.nextInt();
		System.out.print("Enter gallons used or 0 to quit:");
		gallonsUsed = input.nextInt();
		

		while (milesDriven > 0) {
			mpg = (double) (milesDriven / gallonsUsed);
			System.out.printf("The MPG is: %.2f%n", mpg);
			totalMpg += mpg;
			tripCounter += 1;
			
			System.out.print("Enter miles driven or 0 to quit:");
			milesDriven = input.nextInt();
			System.out.print("Enter gallons used or 0 to quit:");
			gallonsUsed = input.nextInt();
			
		}

		System.out.printf("Total MPG is %.2f%n", totalMpg);
		System.out.printf("Total number of trips is %d%n", tripCounter);
		
		if (tripCounter > 0) {
			averageMpg = (double) totalMpg / tripCounter;
			System.out.printf("Average MPG is: %.2f", averageMpg);
		}

	}

}
