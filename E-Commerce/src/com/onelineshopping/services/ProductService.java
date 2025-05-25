package com.onelineshopping.services;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.entities.Product;

public class ProductService {
    private List<Product> catalog = new ArrayList<>();

    public void addProduct(Product product) {
        catalog.add(product);
    }

    public void removeProduct(String productId) {
        catalog.removeIf(p -> p.getProductId().equals(productId));
    }

    public void updateStock(String productId, int newStock) {
        for (Product p : catalog) {
            if (p.getProductId().equals(productId)) {
                p.setStockQuantity(newStock);
            }
        }
    }

    public List<Product> getAllProducts() {
        return catalog;
    }
}