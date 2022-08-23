package com.bridzelab.AccountTest;

public class Account
{
		private double balance;
		
		public Account(double initialBalance) 
		{

			if (initialBalance > 0.0)
				balance=initialBalance;
		}
		
		//credit method for depositing amount
		public void credit(double amount)
		{
			balance=balance+amount;
		}
		
		//Debt method for withdrawing amount
		public void debit(double amount)
		{
			balance=balance-amount;

		}
		
		//getter method for getting balance from the user
		public double getBalance()
		{
			return balance;
		}
}
