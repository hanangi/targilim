package com.gitliz.tirgul10a;

import org.algo.model.PortfolioInterface;
import org.algo.model.StockInterface;

public class PortfolioManager implements PortfolioInterface {
	
	public Portfolio getPortfolio() {
		return new Portfolio();
	}

	@Override
	public StockInterface[] getStocks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updateBalance(float amount) throws IllegalAccessException, BalanceException{
		
		Portfolio portfolio = getPortfolio();
		
		try {
			portfolio.updateBalance(amount);
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
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

}
