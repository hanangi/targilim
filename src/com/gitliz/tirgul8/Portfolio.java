package com.gitliz.tirgul8;

import org.algo.model.PortfolioInterface;
import org.algo.model.StockInterface;

public class Portfolio implements PortfolioInterface {

	private float balance;

	@Override
	public StockInterface[] getStocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getHtmlString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updateBalance(float amount) {
		this.balance += amount;
	}

}
