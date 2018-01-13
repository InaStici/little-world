package exercises;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Date date = new Date(0,0,0);
		
		System.out.print("Enter month: ");
		int month = input.nextInt();
		date.setMonth(month);
		
		System.out.print("Enter day: ");
		int day = input.nextInt();
		date.setDay(day);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		date.setYear(year);
		
		System.out.println();
		
		System.out.printf(date.displayDate());

	}

}
