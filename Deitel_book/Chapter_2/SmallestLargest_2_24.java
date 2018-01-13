package exercises;
import java.util.Scanner;
public class SmallestLargest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int e;
		
		//declare the integers
		System.out.print("Enter first integer:");
		a = input.nextInt();
		System.out.print("Enter second integer:");
		b = input.nextInt();
		System.out.print("Enter third integer:");
		c = input.nextInt();
		System.out.print("Enter forth integer:");
		d = input.nextInt();
		System.out.print("Enter fifth integer:");
		e = input.nextInt();
		
		//determine the smallest integer
		if (a<=b && a<=c && a<=d && a<=e)
			System.out.println(a + " is the smallest number");
		if (b<=a && b<=c && b<=d && b<=e)
			System.out.println(b + " is the smallest number");
		if (c<=a && c<=b && c<=d && c<=e)
			System.out.println(c + " is the smallest number");
		if (d<=a && d<=b && d<=c && d<=e)
			System.out.println(d + " is the smallest number");
		if (e<=a && e<=b && e<=c && e<=d)
			System.out.println(e + " is the smallest number");
		
		//determine the largest number
		if (a>=b && a>=c && a>=d && a>=e)
			System.out.println(a + " is the largest number");
		if (b>=a && b>=c && b>=d && b>=e)
			System.out.println(b + " is the largest number");
		if (c>=a && c>=b && c>=d && c>=e)
			System.out.println(c + " is the largest number");
		if (d>=a && d>=b && d>=c && d>=e)
			System.out.println(d + " is the largest number");
		if (e>=a && e>=b && e>=c && e>=d)
			System.out.println(e + " is the largest number");

	}

}
