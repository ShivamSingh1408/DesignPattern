package com.aurionpro.test;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class lineItemTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Iqoo z3", 15000, 2000);
		System.out.println(p1);
		System.out.println("Price after discount: " + p1.calculatePriceAfterDiscount());

		LineItem l1 = new LineItem(101, 3, p1);
		System.out.println(l1);
		System.out.println("Line Item Cost is " + l1.calculateLinItemCost());
		System.out.println("---------------------------");

		Product p2 = new Product(102, "Good Day", 100, 10);
		System.out.println(p2);
		System.out.println("Price after discount: " + p2.calculatePriceAfterDiscount());
		
		LineItem l2 = new LineItem(102, 5, p2);
		System.out.println(l2);
		System.out.println("Line Item Cost is " + l2.calculateLinItemCost());
		System.out.println("---------------------------");

		Order o1 = new Order(101, "11/08/2022");
		o1.addLineItem(l1);
		o1.addLineItem(l2);
		
		Customer customer = new Customer(101, "Shivam");
		customer.addOrder(o1);
		System.out.println("Order Count: " + customer.getOrderCount());
		System.out.println(customer);
		System.out.println(customer.cartTotal());
	}
}
