package org.lld.inheritenceAndPolymorphism;

public class Product {
    int id;
    String name;
    int quantity;
    int price;

    public Product(int id, String name, int quantity, int price) {
        this(id, name, quantity);
        this.price = price;
    }

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }




}
