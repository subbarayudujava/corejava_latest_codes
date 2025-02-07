package com.arrays;

public class Customer {
	public String orderId;
	public String prodectname;
	public String prodectId;
	public Order order;

	// Constructor to accept an Order object
	Customer(Order c) {
		order = c;
	}

	@Override
	public String toString() {
		return "Customer [orderId=" + orderId + ", prodectname=" + prodectname + ", prodectId=" + prodectId + ", order="
				+ order + "]";
	}

	public static void main(String[] args) {
		// Create an Order object and set its values
		Order order = new Order();
		order.name = "subbarayudu";
		order.contract = "12345";

		// Create a Customer object and associate the Order object
		Customer cm = new Customer(order);
		cm.orderId = "12334";
		cm.prodectname = "IPhone";
		cm.prodectId = "0A12mj";
		// Print customer details
		System.out.println("Order Name: " + cm.order.name);
		System.out.println("Order Contract: " + cm.order.contract);
		System.out.println(cm.toString());
	}
}

class Order {
	String name;
	String contract;

	@Override
	public String toString() {
		return "Order [name=" + name + ", contract=" + contract + "]";
	}

}
