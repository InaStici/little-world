package exercises;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		
		//create 2 Account objects
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//display initial balance of each object
		//System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		//System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.println();
		
		System.out.println("Enter depositAmount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%naddind %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); //add to account1's balance
		
		//display balances
		//System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		//ystem.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.println("Enter depositAmount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%naddind %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount); //add to account1's balance
		
		//display balances
				//System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
				//System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		displayAccount(account1);
		displayAccount(account2);
				
				System.out.println();
		System.out.println("Enter amount to be withdrawn from account1: ");
		double wthAmount = input.nextDouble();
		//System.out.printf("%nwithdraw %.2f from account1 balance%n%n", wthAmount);
		account1.withdraw(wthAmount);		
		
		System.out.println("Enter amount to be withdrawn from account2: ");
		wthAmount = input.nextDouble();
		//System.out.printf("%nwithdraw %.2f from account2 balance%n%n", wthAmount);
		account2.withdraw(wthAmount);
		
		//System.out.printf("%sbalance: $%.2f%n", account1.getName(), account1.getBalance());
		//ystem.out.printf("%sbalance: $%.2f%n", account2.getName(), account2.getBalance());
		
		displayAccount(account1);
		displayAccount(account2);
	}

	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%sbalance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
		//System.out.printf("%sbalance: $%.2f%n", account2.getName(), account2.getBalance());
	}

	}


