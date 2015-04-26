package com.gitliz.targil5.model;

public class Mall {

	private static final int MAX_SHOP_SIZE = 51;
	
	private String name;
	private String address;
	private int numOfFloors;
	private int shopIndex;
	
	private Shop[] shops;
	
	public Mall() {
		this.name = "Azriaeli";
		this.numOfFloors = 0;
		this.shopIndex = 0;
		this.shops = new Shop[MAX_SHOP_SIZE];
	}
	
	public void addShop(Shop shop) {
		
		if(shop != null && shopIndex < MAX_SHOP_SIZE) {
			this.shops[shopIndex] = shop;
			shopIndex++;
		}else {
			System.out.println("Sorry, mall is full, or is shop is null!");
		}
		
	}
	
	public String getHtmlString() {
		
		String ret = new String( "<h1>" + getName() + "</h1>" );
		
		for(int i = 0; i < shopIndex ;i++) {
			Shop current = this.shops[i];
			ret += current.getHtmlDesc() + "<br>";
		}
		
		return ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}

	public Shop[] getShops() {
		return shops;
	}

	public void setShops(Shop[] shops) {
		this.shops = shops;
	}
}
