package com.onelineshopping.services;

import java.util.List;
import java.util.Map;

import com.onlineshopping.entities.Customer;
import com.onlineshopping.entities.Order;
import com.onlineshopping.entities.Product;

public class CustomerService {
    public void addToCart(Customer customer, Product product, int quantity) {
        if (product.getStockQuantity() >= quantity) {
            customer.getShoppingCart().addItem(product, quantity);
            product.setStockQuantity(product.getStockQuantity() - quantity);
        }
    }

    public void placeOrder(Customer customer, List<Order> orderList) {
        Map<Product, Integer> cartItems = customer.getShoppingCart().getItems();
        if (!cartItems.isEmpty()) {
            Order newOrder = new Order(customer, cartItems);
            customer.getOrders().add(newOrder);
            orderList.add(newOrder);
            customer.getShoppingCart().clearCart();
            System.out.println("Order placed: " + newOrder.getOrderId());
        }
    }

    public void listOrders(Customer customer) {
        for (Order order : customer.getOrders()) {
            order.displayOrder();
        }
    }
}