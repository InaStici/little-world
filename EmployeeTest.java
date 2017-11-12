package exercises;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee emp1 = new Employee("Andrei ", "Domenti", 100.0);
		Employee emp2 = new Employee("Ina ", "Stici", 100.0);
		
		System.out.print("Enter monnthly salary for emp1: ");
		double salary = input.nextDouble();
		emp1.setMonthlySalary(salary);
		
		System.out.print("Enter monnthly salary for emp2: ");
		salary = input.nextDouble();
		emp2.setMonthlySalary(salary);
		
		System.out.println();
		
		System.out.printf("%s%s has monthly salary $%.3f%n", emp1.getFirstName(), emp1.getLatName(), emp1.getMonthlySalary());
		System.out.printf("%s%s has monthly salary $%.3f%n", emp2.getFirstName(), emp2.getLatName(), emp2.getMonthlySalary());
		
		System.out.println();
		
		System.out.printf("%s%s has yearly salary $%.3f%n", emp1.getFirstName(), emp1.getLatName(), emp1.getMonthlySalary()*12);
		System.out.printf("%s%s has yearly salary $%.3f%n", emp2.getFirstName(), emp2.getLatName(), emp2.getMonthlySalary()*12);
		
		System.out.println();
		
		System.out.print("Enter rise for emp1: %");
		double riseSalary = input.nextDouble();
		emp1.setMonthlySalary(emp1.getMonthlySalary()*(1+riseSalary/100));
		
		System.out.print("Enter rise for emp2: %");
		riseSalary = input.nextDouble();
		emp2.setMonthlySalary(emp2.getMonthlySalary()*(1+riseSalary/100));
		
		System.out.println();
		System.out.printf("%s%s has monthly salary after rise $%.3f%n", emp1.getFirstName(), emp1.getLatName(), emp1.getMonthlySalary());
		System.out.printf("%s%s has monthly salary after rise $%.3f%n", emp2.getFirstName(), emp2.getLatName(), emp2.getMonthlySalary());
		
		System.out.println();
		
		System.out.printf("%s%s has yearly salary after rise $%.3f%n", emp1.getFirstName(), emp1.getLatName(), emp1.getMonthlySalary()*12);
		System.out.printf("%s%s has yearly salary after rise $%.3f%n", emp2.getFirstName(), emp2.getLatName(), emp2.getMonthlySalary()*12);
		
		
	}

}
