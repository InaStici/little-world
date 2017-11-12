package exercises;

public class Account {


		private String name; //instance variable
		private double balance;
		
		//constructor initializes name with parameters name and balance
		public Account(String name, double balance)//constructor name is class name
		{
			this.name = name;
			//validate that balance is greater than 0.0, if it's not,
			//instance variable balance keeps its default initial value of 0.0
			if (balance > 0.0) //verify if balance is valid
			this.balance = balance;
		}
		
		//method that deposits only a valid amount of the balance
		public void deposit(double depositAmount)
		{
			if (depositAmount > 0.0)
				balance = balance + depositAmount; //add depositAmount to balance
		}
		
		//method to withdraw money from account
				public void withdraw(double wthAmount)
				{
					if(wthAmount <=balance)
					balance = balance - wthAmount;
					else 
						System.out.println("Withdrawal amount exceeded account balance");
				}
		
		//method that returns account balance
		public double getBalance()
		{
			return balance;
		}
		
		//method to set the name in the object
		public void setName(String name)
		{
			this.name = name; //store the name
		}
		
		//method to retrieve the name from the object
		public String getName()
		{
			return name; //return value of name to caller
		}
	} //end class Account


