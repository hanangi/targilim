package com.gitliz.targil6;

public class DemoEnum {
	
	/*public final static float MIN_HEIGHT = 0.65f;
	public final static float AVG_HEIGHT = 1.70f;
	public final static float MAX_HEIGHT = 2.3f;
	
	public void checkHeight(float height) {
		if(height >= MIN_HEIGHT && height < AVG_HEIGHT) {
			System.out.println("this guy is short!");
		}
	}*/
	
	/* ************************************************************ */
	
	/*public enum Height {
		MIN_HEIGHT (0.65f),AVG_HEIGHT(1.7f),MAX_HEIGHT(2.3f);
		
		private float  val;
		
		private Height(float value) {
			this.val = value;
		}
		
		public float getVal() {
			return val;
		}
	}
	

	public void checkHeight(Height height) {
		if(height.getVal() > Height.MAX_HEIGHT.getVal() && height.getVal() < Height.AVG_HEIGHT.getVal()) {
			System.out.println("this guy is short!");
		}
	}
*/	
	
	/* ************************************************************ */
	
	
	public static final int BUY = 0;
	public static final int SELL = 1;
	public static final int DO_NOTHING = 2;
	
	
	public void exectue(int status) {
		if(status == BUY) {
			System.out.println("[with constant] going to buy!");
		}else if(status == SELL) {
			System.out.println("[with constant]going to sell!");
		}
	}
	
	public enum Operation{
		BUY, SELL, DO_NOTING
	}
	
	public void execute(Operation status) {
		if(status.equals(Operation.BUY)) {
			System.out.println("[with enum] going to buy!");			
		}else if(status.equals(Operation.SELL)) {
			System.out.println("[with enum] going to sell!");			
		} 
	}
	
}





