package com.onlineshopping.application;
import java.util.*;

import com.onelineshopping.services.AdminService;
import com.onelineshopping.services.CustomerService;
import com.onelineshopping.services.OrderService;
import com.onelineshopping.services.ProductService;
import com.onlineshopping.entities.Admin;
import com.onlineshopping.entities.Customer;
import com.onlineshopping.entities.Order;
import com.onlineshopping.entities.Product;

public class OnlineShopping {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ProductService productService = new ProductService();
	        AdminService adminService = new AdminService(productService);
	        CustomerService customerService = new CustomerService();
	        OrderService orderService = new OrderService();

	        Admin admin = new Admin("A1", "AdminUser", "admin@example.com");
	        Customer customer = new Customer("C1", "JohnDoe", "john@example.com", "123 Main St");

	        List<Order> orderList = new ArrayList<>();

	        while (true) {
	            System.out.println("1. Admin Menu\n2. Customer Menu\n3. Exit");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("1. Add Product 2. Remove Product 3. Update Stock 4. Back");
	                    int adminChoice = scanner.nextInt();
	                    switch (adminChoice) {
	                        case 1:
	                            System.out.println("Enter productId, name, price, stock:");
	                            Product product = new Product(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());
	                            adminService.manageProduct(product, "add");
	                            break;
	                        case 2:
	                            System.out.println("Enter productId:");
	                            adminService.manageProduct(new Product(scanner.next(), "", 0.0, 0), "remove");
	                            break;
	                        case 3:
	                            System.out.println("Enter productId and new stock:");
	                            productService.updateStock(scanner.next(), scanner.nextInt());
	                            break;
	                    }
	                    break;
	                case 2:
	                    System.out.println("1. Browse 2. Add to Cart 3. View Cart 4. Place Order 5. List Orders 6. Back");
	                    int custChoice = scanner.nextInt();
	                    switch (custChoice) {
	                        case 1:
	                            for (Product p : productService.getAllProducts()) System.out.println(p);
	                            break;
	                        case 2:
	                            System.out.println("Enter productId and quantity:");
	                            String pid = scanner.next();
	                            int qty = scanner.nextInt();
	                            for (Product p : productService.getAllProducts()) {
	                                if (p.getProductId().equals(pid)) {
	                                    customerService.addToCart(customer, p, qty);
	                                }
	                            }
	                            break;
	                        case 3:
	                            customer.getShoppingCart().displayCart();
	                            break;
	                        case 4:
	                            customerService.placeOrder(customer, orderList);
	                            break;
	                        case 5:
	                            customerService.listOrders(customer);
	                            break;
	                    }
	                    break;
	                case 3:
	                    System.exit(0);
	            }
	        }
	    }
	}

