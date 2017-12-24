package exercises;

import java.util.Scanner;

public class ParkingCharges_6_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter parking hours: ");
		double hours = input.nextDouble();
		
		if (hours <= 0) {
			System.out.println("Error! Please enter hours greater than zero");
			 hours = input.nextDouble();
		}
		
		double charge = chargePerStay(hours);
		System.out.println("The parking charge is " + charge);
	}
	
	public static double chargePerStay(double x) {
		double fee = 0;
		
		if (x <= 3) {
			fee = x * 2.00;
			}
		
		if (x > 3) {
			fee = 6.00 + (x - 3) * 0.50;
		}
		
		return fee;
		}
}
