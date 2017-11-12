package exercises;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
				
		System.out.println("Enter an integer:");
		a = input.nextInt();
				
		if (a % 2 == 0)
			System.out.println("The number is even");
		
		else 
			System.out.println("The number is odd");	
	}

}
