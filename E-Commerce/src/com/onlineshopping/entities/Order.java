package com.onlineshopping.entities;
import java.util.*;

public class Order {

    private static int orderCount = 0;
    private String orderId;
    private Customer customer;
    private Map<Product, Integer> products;
    private String status;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.orderId = "ORD" + (++orderCount);
        this.customer = customer;
        this.products = new HashMap<>(products);
        this.status = "Pending";
    }

    public String getOrderId() { return orderId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey().getName() + " x " + entry.getValue());
        }
        System.out.println("Status: " + status);
    }
}
