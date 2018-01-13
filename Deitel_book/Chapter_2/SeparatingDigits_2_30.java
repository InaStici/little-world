package exercises;
import java.util.Scanner;
public class SeparatingDigits {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int i;
		int nr1;
		int nr2;
		int nr3;
		int nr4;
		int nr5;
		
		System.out.print("Enter i: ");
		i = input.nextInt();
				
		nr1 = (i%100000)/10000;
		nr2 = (i%10000)/1000;
		nr3 = (i%1000)/100;
		nr4 = (i%100)/10;
		nr5 = (i%10);
		
		System.out.printf("%d   %d   %d   %d   %d", nr1, nr2, nr3, nr4, nr5);

	}

}
