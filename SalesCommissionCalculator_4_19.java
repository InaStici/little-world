package exercises;
import java.util.Scanner;
public class SalesCommissionCalculator_4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double totalEarning = 0;
		double earning1 = 0;
		double earning2 = 0;
		double earning3 = 0;
		double earning4 = 0;
		
		
		System.out.print("Enter items sold or 0 to quit: ");
		int items = input.nextInt();
		while (items != 0) {
		//items = 4;
		switch (items) {
		case 1:
			 earning1 = 239.99;
			System.out.printf("Earning for item 1 is: %.2f%n", earning1);
			break;
		case 2:
			 earning2 = 129.75;
			System.out.printf("Earning for item 2 is: %.2f%n", earning2);
			break;
		case 3:
			 earning3 = 99.95;
			System.out.printf("Earning for item 3 is: %.2f%n", earning3);
			break;
		case 4:
			 earning4 = 350.89;
			System.out.printf("Earning for item 4 is: %.2f%n", earning4);
			break;
		default:
			System.out.println("No such item sold!");
			break;
			
			}
		totalEarning = earning1 + earning2 + earning3 + earning4 ;
		System.out.printf("Total earning is %.2f%n", totalEarning);	
		System.out.print("Enter items sold or 0 to quit: ");
		items = input.nextInt();
	}
		
		double salary = 200 + totalEarning * 0.09;	
		
		
		System.out.printf("Salesperson's earning is: %.2f%n", salary);
	}

}
