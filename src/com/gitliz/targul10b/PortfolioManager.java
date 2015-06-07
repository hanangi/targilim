package com.gitliz.targul10b;

import org.algo.dto.PortfolioTotalStatus;
import org.algo.exception.PortfolioException;
import org.algo.model.PortfolioInterface;
import org.algo.service.PortfolioManagerInterface;

public class PortfolioManager implements PortfolioManagerInterface {

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public Portfolio getPortfolio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBalance(float value) throws PortfolioException {
		
		Portfolio p = getPortfolio();
		
		try {
			p.updateBalance(value);
		}catch (BalanceException e) {
			//mail admin
			
			throw e;
		}
	}

	@Override
	public PortfolioTotalStatus[] getPortfolioTotalStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStock(String symbol) throws PortfolioException {
		// TODO Auto-generated method stub

	}

	@Override
	public void buyStock(String symbol, int quantity) throws PortfolioException {
		// TODO Auto-generated method stub

	}

	@Override
	public void sellStock(String symbol, int quantity)
			throws PortfolioException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeStock(String symbol) throws PortfolioException {
		// TODO Auto-generated method stub

	}

}
