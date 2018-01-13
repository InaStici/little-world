package exercises;
import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
	 
		
		Scanner input = new Scanner(System.in);
		
		Invoice purchase = new Invoice("01", "Guitar", 10, 45.0);
		
		System.out.printf("%s.%s: %d $%.2f%n", purchase.getPartNr(), purchase.getPartDesc(), purchase.getQuantity(), purchase.getPrice());
		
		System.out.println("Enter price:");
		double price = input.nextDouble();
		purchase.setPrice(price);
		//purchase.getPrice();
		
		System.out.println("Enter quantity:");
		int quantity = input.nextInt();
		purchase.setQuantity(quantity);
		//purchase.getQuantity();
		
	
		System.out.printf("Amount for purchase is: $%.2f%n", purchase.getInvoiceAmount());
		
		
	}

}
