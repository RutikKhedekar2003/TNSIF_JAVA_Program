package com.onelineshopping.services;


import com.onlineshopping.entities.Order;

public class OrderService {
    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
    }
}