package com.onelineshopping.services;
import com.onlineshopping.entities.Product;

public class AdminService {

	    private ProductService productService;

	    public AdminService(ProductService productService) {
	        this.productService = productService;
	    }

	    public void manageProduct(Product product, String action) {
	        switch (action.toLowerCase()) {
	            case "add": productService.addProduct(product); break;
	            case "remove": productService.removeProduct(product.getProductId()); break;
	        }
	    }
	}
