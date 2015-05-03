package com.gitliz.targil6;

import com.gitliz.targil6.Car.Color;

public class Sit {

	private String cover;
	private Color color;
	
	public Sit() {}
	
	public Sit(Sit sit) {
		this.cover = new String(sit.getCover());
		this.color = sit.getColor();
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
