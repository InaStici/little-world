package exercises;

import java.util.Scanner;

public class Palindromes_4_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 5 symbol palindrome: ");
		String palindrome = input.nextLine();

		while (palindrome.length() != 5) {
			System.out.println("Error. Please enter a 5 symbol palindrome");
			palindrome = input.nextLine();
		}

		StringBuffer buffer = new StringBuffer(palindrome);
		buffer = buffer.reverse();

		String reversed = buffer.toString();

		if (palindrome.equals(reversed)) {
			System.out.println("The entry " + palindrome + " is a palindrome");

		} else {
			System.out.println("The entry " + palindrome + " is not a palindrome");

		}

	}

}
