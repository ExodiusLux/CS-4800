package org.example;

public class Fries implements Food{
    private final double price = 1.50;

    @java.lang.Override
    public double getPrice() {
        return price;
    }

    @java.lang.Override
    public java.lang.String getDescription() {
        return "Fries";
    }
}
