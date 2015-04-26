package com.gitliz.targil5.model;

public class Shop {
	
	private String name;
	private String type;
	private float monthlyRevenue;
	
	public Shop(String name, String type, float monthlyRevenue){
		this.name = name;
		this.type = type;
		this.monthlyRevenue = monthlyRevenue;
	}

	public String getHtmlDesc() {
		return "<b>Name:</b> " + getName() + " <b>Type: </b>" + getType() + " <b>Rev`: </b> " + getMonthlyRevenue();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getMonthlyRevenue() {
		return monthlyRevenue;
	}

	public void setMonthlyRevenue(float monthlyRevenue) {
		monthlyRevenue = monthlyRevenue;
	}
	
	

}
