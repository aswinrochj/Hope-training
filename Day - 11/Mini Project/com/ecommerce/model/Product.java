package com.ecommerce.model;

public class Product {
    private int id;
    private String name;
    private int price;

    // Correct Constructor
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void display() {
        System.out.println(this.id + " " + this.name + " $" + this.price);
    }
}