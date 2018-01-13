package exercises;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nr1;
		int nr2;
		int nr3;
		int nr4;
		int nr5;
		
		int zero=0;
		int negative=0;
		int positive=0;
		
		System.out.print("nr1=");
		nr1 = input.nextInt();
		System.out.print("nr2=");
		nr2 = input.nextInt();
		System.out.print("nr3=");
		nr3 = input.nextInt();
		System.out.print("nr4=");
		nr4 = input.nextInt();
		System.out.print("nr5=");
		nr5 = input.nextInt();
		
		if (nr1 == 0)
			zero += 1;
		if (nr2 == 0)
			zero += 1;
		if (nr3 == 0)
			zero += 1;	
		if (nr4 == 0)
			zero += 1;
		if (nr5 == 0)
			zero += 1;
			
		if (nr1 < 0)
			negative += 1;
		if (nr2 < 0)
			negative += 1;
		if (nr3 < 0)
			negative += 1;
		if (nr4 < 0)
			negative += 1;
		if (nr5 < 0)
			negative += 1;
			
		if (nr1 > 0)
			positive += 1;
		if (nr2 > 0)
			positive += 1;
		if (nr3 > 0)
			positive += 1;
		if (nr4 > 0)
			positive += 1;	
		if (nr5 > 0)
			positive += 1;

			System.out.printf("Number of zeros input is %d%n", zero);
			System.out.printf("Number of negative numbers input is %d%n", negative);
			System.out.printf("Number of positive numbers input is %d%n", positive);
	}

}
