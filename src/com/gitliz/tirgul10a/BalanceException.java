package com.gitliz.tirgul10a;

public class BalanceException extends Exception {

	public BalanceException(float amount) {
		super("Balance can't be negetive, " + amount + " is too big.");
	}
}
