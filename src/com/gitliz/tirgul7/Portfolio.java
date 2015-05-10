package com.gitliz.tirgul7;

public class Portfolio {

	private static final int SIZE = 7;
	
	private float balance;
	private String[] stocks;
	
	public Portfolio() {
		this.balance = 0;
		stocks = new String[SIZE];
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void updateBalance(float balance) {
		this.balance += balance;
	}
	
	public String[] getStocks() {
		return stocks;
	}
	
	public static void main(String[] args) {
		
		Portfolio p = new Portfolio();
		p.updateBalance(1000);
		
		System.out.println(p.getBalance());
		
		p.updateBalance(-30);
		
		System.out.println(p.getBalance());
	}
}
