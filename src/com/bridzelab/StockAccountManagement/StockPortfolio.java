package com.bridzelab.StockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {

    ArrayList<StockAccount> stockAccountsList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private void setStocks() 
    {
        System.out.println("Welcome to Stock Account management");
        System.out.println("***********************************");

        System.out.println("Enter the Number of Stock Account You Want : ");
        int no = sc.nextInt();
        for(int i = 0; i < no; i++) 
        {
            StockAccount stockAccount = new StockAccount();
            setStockInfo(stockAccount,i);
        }
    }

    private void setStockInfo(StockAccount stockAccount, int i)
    {
        System.out.println("Enter the Stock "+(i+1)+" Information :");
        System.out.println("Enter the Stock Name :");
        stockAccount.setStockName(sc.next());
        System.out.println("Enter the Number of Shares :");
        stockAccount.setNoOfShares(sc.nextInt());
        System.out.println("Enter the Price of Shares :");
        stockAccount.setSharePrice(sc.nextDouble());
        stockAccount.setShareTotalValue(stockAccount.getNoOfShares());
        stockAccountsList.add(stockAccount);
    }

    private void getStockInfo() 
    {
        int i = 1;
        for(StockAccount stockAccount : stockAccountsList)
        {
            System.out.println("The Stock "+i+" Information is :");
            System.out.println("Stock Name : "+stockAccount.getStockName());
            System.out.println("Number of Shares : "+stockAccount.getNoOfShares());
            System.out.println("Price of Shares : "+stockAccount.getSharePrice());
            System.out.println("Total Value of Shares : "+stockAccount.getShareTotalValue());
            i++;
        }
    }

    public static void main(String[] args) 
    {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }
}