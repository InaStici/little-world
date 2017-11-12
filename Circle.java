package exercises;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int r;
		int diameter;
		float circumference;
		float area;
		
		System.out.print("Enter the radius: ");
		r = input.nextInt();
		
		diameter = r * 2;
		System.out.print("Diameter of the circle is: ");
		System.out.printf("%d%n", diameter);
		
		circumference = (float) (2 * r * Math.PI);
		System.out.print("Circumference of the circle is: ");
		System.out.printf("%f%n", circumference);
		
		area = (float) (r * r * Math.PI);
		System.out.print("Area of the circle is: ");
		System.out.printf("%f%n", area);
		
		
	}

}
