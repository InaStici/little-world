package exercises;

public class Date {

	private int month;
	private int day;
	private int year;
	
	
	public Date(int month, int day, int year)
	{
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}
	
	public void setMonth(int month)
	{if (month<0 && month>12) {
		System.out.println("Wrong month!");
	}else
		this.month = month;}
	
	public int getMonth()
	{return month;}
	
	public void setDay(int day)
	{if (day<0 && day>31) {
		System.out.println("Wrong day!");}
		else
		
		this.day = day;}
	
	public int getDay()
	{return day;}
	
	public void setYear(int year)
	{if (year>0)
		this.year = year;}
	
	public int getYear()
	{return year;}
	
	public String displayDate()
	{return month +"/"+ day +"/"+ year;
	}
}
