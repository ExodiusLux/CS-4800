package org.example;

public class Burger implements Food{
    private final double price = 5.0;
    @java.lang.Override
    public double getPrice() {
        return price;
    }

    @java.lang.Override
    public java.lang.String getDescription() {
        return "Burger";
    }
}
