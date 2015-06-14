package com.gitliz.tirgul11;

import java.util.Scanner;
import java.util.logging.Logger;

import com.gitliz.tirgul11.command.Command;
import com.gitliz.tirgul11.command.DirCommad;
import com.gitliz.tirgul11.command.QuitCommand;
import com.gitliz.tirgul11.eception.UnknownCommand;

public class CommandParser {
	
	private final static Logger log = Logger.getLogger(CommandParser.class.getSimpleName());

	private Scanner scanner = new Scanner(System.in);
	
	private enum CommandClass {
		quit, ls
	}
	
	public Command parse() throws UnknownCommand {
		String line = readLine();
		
		String[] split = line.split(" ");
		
		String command = split[0];
		
		CommandClass cc = null;
		try {
			cc = CommandClass.valueOf(command);
		}catch (IllegalArgumentException e) {
			throw new UnknownCommand(command);
		}
		
 		switch (cc) {
		case ls:
			return new DirCommad();
		case quit:
			return new QuitCommand();
		default:
			break;
		}

		return null;
	}

	private String readLine() {
		//  prompt for the user's name
		System.out.print("Enter your next command: ");

		// get their input as a String
		String line = scanner.next();
		
		log.info("Read line: " + line);
		
		return line;
	}
}
