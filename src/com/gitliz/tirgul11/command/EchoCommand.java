package com.gitliz.tirgul11.command;

import java.util.logging.Logger;

public class EchoCommand implements Command {
	private final static Logger log = Logger.getLogger(EchoCommand.class.getSimpleName());

	@Override
	public void execute(String[] params) {
		log.info("User request to do command: echo " + params);
	}
}
