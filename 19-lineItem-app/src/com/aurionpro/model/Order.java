package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public int id;
	public String date;

	List<LineItem> items = new ArrayList<>();

	public Order(int id, String date) {
		super();
		this.id = id;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int itemsCount() {
		return items.size();
	}

	public double calculateOrderPrice() {
		double totalPrice =0;
		for (LineItem i:items) {
			totalPrice = totalPrice + i.calculateLinItemCost();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}
}
