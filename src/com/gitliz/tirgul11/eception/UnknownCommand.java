package com.gitliz.tirgul11.eception;

public class UnknownCommand extends Exception {

	public UnknownCommand(String command) {
		super("Unknown command [" + command + "]");
	}
}
