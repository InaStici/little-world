package exercises;
import java.util.Scanner;
public class SquareOfAsterisks_4_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Enter square side between 1 and 15: ");
		int x = input.nextInt();
		
		while (x < 1 || x > 20) {
			System.out.println("Error!");
			System.out.print("Enter square side between 1 and 15: ");
			x = input.nextInt();
		}
			
			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= x; j++) {
				System.out.print("*");
			
				}

				System.out.println();
			}
		
	}

}
