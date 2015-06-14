package com.gitliz.tirgul11.mammal;

import java.util.Scanner;
import java.util.logging.Logger;

import com.gitliz.tirgul11.CommandParser;

/**
 * I'm responsible of getting a string from console  and
 * creating a instance out of it. 
 * @author hanang
 *
 */
public class AnimalParser {
	
	private final static Logger log = Logger.getLogger(CommandParser.class.getSimpleName());

	private Scanner scanner = new Scanner(System.in);
	
	private enum AnimalClass {
		dog, cat, quit
	}
	
	public  EearthMammal parse() {
		String line = readLine();
		
		AnimalClass aEnum;
		try {
			aEnum = AnimalClass.valueOf(line);
			
		}catch(IllegalArgumentException e) {
			return new NoAnimal(line);
		}

		switch (aEnum) {
		case dog:
			return new Dog();
		case cat:
			return new Cat();
		case quit:
			return new Quit();
		}
		
		/*String[] split = line.split(" ");
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
*/
		return null;
	}

	private String readLine() {
		//  prompt for the user's name
		System.out.print("Enter your next animal: ");

		// get their input as a String
		String line = scanner.next();
		
		log.info("Read line: " + line);
		
		return line;
	}
}
