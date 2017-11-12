package exercises;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	//private double yearlySalary;
	
	public Employee (String firstName, String lastName, double monthlySalary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMonthlySalary(monthlySalary);
		}
	
	public void setFirstName(String firstName)
	{this.firstName = firstName;}
	
	public String getFirstName()
	{return firstName;}
	
	public void setLastName(String lastName)
	{this.lastName = lastName;}
	
	public String getLatName()
	{return lastName;}
	
	public void setMonthlySalary(double monthlySalary)
	{if (monthlySalary < 0) {
		monthlySalary = 0;
	}
		this.monthlySalary = monthlySalary;}
	
	
	public double getMonthlySalary()
	{return monthlySalary ;}
	

	
	
	
}
