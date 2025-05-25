package com.onlineshopping.entities;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int quantity) { this.stockQuantity = quantity; }

    @Override
    public String toString() {
        return productId + ": " + name + " - Rs." + price + " (Stock: " + stockQuantity + ")";
    }
}
