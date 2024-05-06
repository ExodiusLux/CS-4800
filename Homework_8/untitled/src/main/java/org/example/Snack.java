package org.example;

public class Snack {
    private String name;
    private double price;
    private int quantity;

    public Snack(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public java.lang.String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
