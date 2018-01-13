package exercises;

import java.util.Scanner;

public class ReversingDigits_6_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter positive number: ");
		int number = sc.nextInt();
		
		while (number < 0) {
			System.out.print("Enter positive number: ");
			number = sc.nextInt();
		}
		
		int reversedNumber = reverse(number);
		System.out.print("The reversed number is: " + reversedNumber);

	}
	
	public static int reverse(int number) {
		
		int reversedNumber = 0;
		int length = (int)(Math.log10(number)+1);
		for (int i = 0; i < length; i++) {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + number%10;
			number = number/10;
		}
		
		return reversedNumber;
	}

}
