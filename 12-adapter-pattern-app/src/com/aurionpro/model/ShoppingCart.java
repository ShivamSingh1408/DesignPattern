package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
private List<IItem> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<IItem>();
	}
	
	public List<IItem> getItems(){
		return this.items;
	}
	public void addItemToCart(IItem item) {
		this.items.add(item);
	}
	public double getTotalCartPrice() {
		double total = 0;
		for (IItem i: items) {
			total = total + i.getPrice();
		}
		return total;		
	}
}
