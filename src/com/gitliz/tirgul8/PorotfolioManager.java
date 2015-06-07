package com.gitliz.tirgul8;

import org.algo.dto.PortfolioTotalStatus;
import org.algo.exception.PortfolioException;
import org.algo.service.DatastoreService;
import org.algo.service.PortfolioManagerInterface;
import org.algo.service.ServiceManager;


public class PorotfolioManager implements PortfolioManagerInterface {
	
	private DatastoreService datastoreService = ServiceManager.datastoreService();

	
	public void addStock(int d) {
		
	}
	
	public void update(float d) {
		
	}
	
	public Portfolio getPortfolio() {
		return new Portfolio();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBalance(float amount) throws PortfolioException {
		Portfolio portfolio = getPortfolio();
		portfolio.updateBalance(amount);
		//this.datastoreService.updatePortfolio(portfolioDto);
		
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
