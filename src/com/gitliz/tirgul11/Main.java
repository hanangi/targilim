package com.gitliz.tirgul11;

import java.util.logging.Logger;

import com.gitliz.tirgul11.mammal.AnimalParser;
import com.gitliz.tirgul11.mammal.EearthMammal;
import com.gitliz.tirgul11.mammal.Quit;

public class Main {

	private final static Logger log = Logger.getLogger(Main.class.getSimpleName());

	public static void main(String[] args) {
		//CommandParser cp = new CommandParser();
		AnimalParser cp = new AnimalParser();
		
		EearthMammal animal = null;

		do {

			EearthMammal ea = cp.parse();
			
			if(ea instanceof Quit) {
				break;
			}
			
			ea.walk();

		} while (true);

		log.info("Quitting, bye!");

	}
}
