package exercises;
import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Enter first integer:");
		a = input.nextInt();
		
		System.out.println("Enter second integer:");
		b = input.nextInt();
		
		if (a % b == 0)
			System.out.println(a + " is a multiple of " + b);
		
		else
			System.out.println(a + " is not a multiple of " + b);
	}

}
