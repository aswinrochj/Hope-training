package com.ecommerce.main;

import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;

public class MainApp {
    public static void main(String[] args) {

        CartService cart = new CartService();

        Product p1 = new Product(1, "iPhone 18 Pro Max", DiscountUtil.applyDiscount(170000));

        cart.addProduct(p1);
        cart.showCart();

        int totalAmount = cart.calculateTotal();
        System.out.println("Total Amount : " + totalAmount);
    }
}