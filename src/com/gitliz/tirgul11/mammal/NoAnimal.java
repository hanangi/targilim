package com.gitliz.tirgul11.mammal;

public class NoAnimal implements EearthMammal {
	
	private String line;

	public NoAnimal(String line) {
		this.line = line;
		
	}

	@Override
	public void walk() {
		System.out.println("No such animal [" + line + "]");
	}

}
