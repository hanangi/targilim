package com.gitliz.targil6;

import com.gitliz.targil6.DemoEnum.Operation;

public class EnumUser {

	public static void main(String[] args) {
		
		DemoEnum demoEnum = new DemoEnum();
		
		demoEnum.exectue(DemoEnum.BUY);
		
		//after algo calculation the decision is to sell
		demoEnum.execute(Operation.BUY);
		
		
		
	}
}
