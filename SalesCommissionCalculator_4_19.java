package exercises;
import java.util.Scanner;
public class SalesCommissionCalculator_4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nr;
		double totalAmount = 0;
		double amount1 = 0;
		double amount2 = 0;
		double amount3 = 0;
		double amount4 = 0;
		
		
		System.out.print("Enter item number or 0 to quit: ");
		int items = input.nextInt();
		System.out.print("Enter number of items sold or 0 to quit: ");
		 nr = input.nextInt();
		while (items >=1) {
			
		//items = 4;
		switch (items) {
		case 1:
			amount1 = 239.99 * nr;
			System.out.printf("Earning for item 1 is: %.2f%n", amount1);
			break;
		case 2:
			amount2 = 129.75 * nr;
			System.out.printf("Earning for item 2 is: %.2f%n", amount2);
			break;
		case 3:
			amount3 = 99.95 * nr;
			System.out.printf("Earning for item 3 is: %.2f%n", amount3);
			break;
		case 4:
			amount4 = 350.89 * nr;
			System.out.printf("Earning for item 4 is: %.2f%n", amount4);
			break;
		default:
			System.out.println("No such item sold!");
			break;
			
			}
		
				
		System.out.print("Enter item number or 0 to quit: ");
		items = input.nextInt();
		System.out.print("Enter number of items sold or 0 to quit: ");
		 nr = input.nextInt();
	}
		
		System.out.println();
		
		totalAmount = amount1 + amount2 + amount3 + amount4 ;
		System.out.printf("Total earning is %.2f%n", totalAmount);	
				
		double earning = 200 + totalAmount * 0.09;	
		
		
		System.out.printf("Salesperson's earning is: %.2f%n", earning);
	}

}
