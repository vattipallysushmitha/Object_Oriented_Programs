package com.bridzelab.AccountTest;
//filename: AccountTest.java

//importing scanner class
import java.util.Scanner;

//Account testing class with the main() method
public class AccountTest
{
	
	static Scanner input = new Scanner( System.in );
	static double depositAmount;
	static double debitAmount;
	
	public static void main (String args[])
	{
		System.out.println("!!!Welcome to Account Withdraw Programm!!!");
		System.out.println("******************************************");
	
		Account ac1 = new Account (500.00);
		Account ac2 = new Account (1000.00);
	
	
		System.out.printf("Account1 Balance: $%.2f\n", ac1.getBalance());
		System.out.printf("Account2 Balance: $%.2f\n\n", ac2.getBalance());

		//Enter user input to Account1
		System.out.print( "Enter deposit amount for account1:" ); 
		depositAmount = input.nextDouble();
		
		// adding balance to Account1
		System.out.printf( "\nAdding %.2f to account1 balance\n\n", depositAmount );
		ac1.credit( depositAmount ); 
		
		//displaying  balances of Account1 and Account2
		System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
		System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );
		
		//Enter user input to Account2
		System.out.print( "Enter deposit amount for account2:"); 
		depositAmount = input.nextDouble();
		
		// adding balance to Account2
		System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
		ac2.credit( depositAmount ); 

		//displaying  balances of Account1 and Account2
		System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
		System.out.printf( "Account2 balance: $%.2f\n", ac2.getBalance() );
		System.out.printf( "\n");
		
		System.out.print( "Enter debit amount for account1:");
		debitAmount = input.nextDouble();
		
		//Subtracting the account with the given amount
		System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
		
		
		if (ac1.getBalance()>=debitAmount) 
		{
			ac1.debit( debitAmount );
			System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
			System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );
		}
		else 
		{
			System.out.println("******************************************");
			System.out.println("!!!Debit amount exceeded Account1 balance!!!");
			System.out.println("******************************************");
		}


			System.out.print( "Enter debit amount for account2:");
			debitAmount = input.nextDouble();
			
			//Subtracting the account with the given amount
			System.out.printf("\nSubtracting %.2f from account2 balance\n\n", debitAmount );
			
			if (ac2.getBalance()>=debitAmount) 
			{
				ac2.debit( debitAmount );
				System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
				System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );
			}
			else 
			{
				System.out.println("******************************************");
				System.out.println("!!!Debit amount exceeded Account2 balance!!!");
				System.out.println("******************************************");

			}
			
	}
}
