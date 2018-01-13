package exercises;

import java.util.Scanner;

public class SquareOfAnyCharacter_6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Enter square side between 1 and 15: ");
		int x = input.nextInt();
		
		while (x < 1 || x > 20) {
			System.out.println("Error!");
			System.out.print("Enter square side between 1 and 15: ");
			x = input.nextInt();
		}
		
		System.out.print("Enter character: ");
		char fillCharacter = input.next().charAt(0);
		System.out.println();
		
			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= x; j++) {
				System.out.print(fillCharacter);
			
				}

				System.out.println();
			}

	}

}
