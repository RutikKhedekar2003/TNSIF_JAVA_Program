package com.onlineshopping.entities;
import java.util.*;

	public class Customer extends User {
	    private String address;
	    private ShoppingCart shoppingCart;
	    private List<Order> orders;

	    public Customer(String userId, String username, String email, String address) {
	        super(userId, username, email);
	        this.address = address;
	        this.shoppingCart = new ShoppingCart();
	        this.orders = new ArrayList<>();
	    }

	    public ShoppingCart getShoppingCart() { return shoppingCart; }
	    public List<Order> getOrders() { return orders; }
	    public String getAddress() { return address; }
	}

