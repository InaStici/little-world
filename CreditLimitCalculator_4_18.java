package exercises;

import java.util.Scanner;

public class CreditLimitCalculator_4_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int acctNr;
		int beginningBalance = 0;
		int charges = 0;
		int credits = 0;
		int creditLimit;
		int totalcharges = 0;
		int totalcredits = 0;
		
		// double balance;

		System.out.print("Enter Account number for the customer: ");
		acctNr = input.nextInt();
		System.out.print("Enter balance at the beginning of the month: ");
		beginningBalance = input.nextInt();
		System.out.print("Enter credit limit for the customer's account: ");
		creditLimit = input.nextInt();

		System.out.print("Enter items charged by the customer this month or 0 to quit: ");
		charges = input.nextInt();
		while (charges != 0) {
			totalcharges += charges;
			System.out.print("Enter items charged by the customer this month or 0 to quit: ");
			charges = input.nextInt(); 
		} 
		System.out.printf("Total of all items charged by the customer this month is :%d%n", totalcharges);

		System.out.print("Enter credits applied to the customer’s account this month or 0 to quit: ");
		credits = input.nextInt();
		while (credits != 0) {
			totalcredits += credits;
			System.out.print("Enter credits applied to the customer’s account this month or 0 to quit: ");
			credits = input.nextInt();
		} 
		System.out.print("Total of all credits applied to the customer’s account this month is :" + totalcredits);
		
		System.out.println();
		
		double balance = (double) beginningBalance + totalcharges - totalcredits;
		
		if (balance >= creditLimit)
			System.out.printf("Current balance on the account %d is %.4f%n", acctNr, balance);
		else
			System.out.print("Credit limit excedeed!");

	}

}
