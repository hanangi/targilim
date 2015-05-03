package com.gitliz.targil6;

import com.gitliz.targil6.DemoEnum.Status;

public class EnumUser {

	public static void main(String[] args) {
		
		DemoEnum demoEnum = new DemoEnum();
		
		//after algo calculation the decision is to sell
		demoEnum.execute(Status.SELL);
		
		
		
	}
}
