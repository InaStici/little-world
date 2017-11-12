package exercises;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int sum;
		int average;
		int prod;
		
		System.out.print("Enter first integer:");
		number1 = input.nextInt();//read first number from user
		
		System.out.print("Enter second integer:");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer:");
		number3 = input.nextInt();
		
		sum = number1+number2+number3;
		System.out.print("Sum of the numbers is:");
		System.out.printf("%d%n", sum);
		
		prod = number1*number2*number3;
		System.out.print("Product of the numbers is:");
		System.out.printf("%d%n", prod);
		
		average = sum/3;
		System.out.print("Average of the numbers is:");
		System.out.printf("%d%n", average);

		//determine the smallest number
		if (number1<=number2 && number1<=number3)
			System.out.println(number1 + " is the smallest number");
		if (number2<number1 && number2<=number3)
			System.out.println(number2 + " is the smallest number");
		if (number3<number1 && number3<number2)
			System.out.println(number3 + " is the smallest number");
		
		//determine the largest number
		if (number1>=number2 && number1>=number3)
			System.out.println(number1 + " is the largest number");
		if (number2>number1 && number2>=number3)
			System.out.println(number2 + " is the largest number");
		if (number3>number1 && number3>number2)
			System.out.println(number3 + " is the largest number");
		
		if (number1==number2 && number1==number3 && number2==number3)
			System.out.println("The numbers are equal");
		
		
	}

}
