package com.gitliz.tirgul11.command;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class DirCommad extends AbstractCommand {
	
	private final static Logger log = Logger.getLogger(DirCommad.class.getSimpleName());
	private List<String> command;

	@Override
	public void execute(String[] params) {
		/*this.pb = new ProcessBuilder(command);
		try {
			Process process = this.pb.start();
			
			log.info("" + process.exitValue());
		} catch (IOException e) {
			log.severe(e.getMessage());
		}*/
		
		log.info("User request to do command: dir " + params);
	}
	

}
