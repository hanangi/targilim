package com.gitliz.targul10b;

import org.algo.exception.PortfolioException;

public class BalanceException extends PortfolioException {
	
	public BalanceException(float amount) {
		super("Balance can't be negative [" + amount + "]");
	}
}
