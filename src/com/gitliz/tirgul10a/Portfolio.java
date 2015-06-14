package com.gitliz.tirgul10a;

import org.algo.model.PortfolioInterface;
import org.algo.model.StockInterface;

public class Portfolio implements PortfolioInterface {
	
	private float balance = 0;

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
	
	public void updateBalance (float amount)  throws BalanceException, IllegalAccessException {
		
		if(amount == 0) {
			throw new IllegalAccessException("Why.. it doesn't do anything!!!");
		}
	
		if(amount + balance < 0) {
			throw new BalanceException(amount);
		}
		
	}

}
