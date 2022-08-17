package com.bridzelab.StockAccountManagement;

public class StockAccount
{

	 	private String stockName;
	 	private int noOfShares;
	    private double sharePrice;
	    private int shareTotalValue;
	    
	    
	    
	    public String getStockName()
	    {
			return stockName;
		}
		public void setStockName(String stockName) 
		{
			this.stockName = stockName;
		}
		public int getNoOfShares() 
		{
			return noOfShares;
		}
		public void setNoOfShares(int noOfShares)
		{
			this.noOfShares = noOfShares;
		}
		public double getSharePrice() 
		{
			return sharePrice;
		}
		public void setSharePrice(double sharePrice) 
		{
			this.sharePrice = sharePrice;
		}
		public int getShareTotalValue()
		{
			return shareTotalValue;
		}
		public void setShareTotalValue(int shareTotalValue) {
			this.shareTotalValue = shareTotalValue;
		}
}		
