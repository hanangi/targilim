package com.gitliz.targil5.service;

import com.gitliz.targil5.model.Mall;
import com.gitliz.targil5.model.Shop;

public class MallManager {

	
	public Mall getMall() {
		Mall mall = new Mall("");
		mall.setName("Tirgul 5 Mall");
		
		Shop shop = new Shop("H & M", "Clothing", 1000000);
		mall.addShop(shop);
		
		shop = new Shop("Bug", "Computers", 34);
		mall.addShop(shop);
		
		return mall;
	}
}
