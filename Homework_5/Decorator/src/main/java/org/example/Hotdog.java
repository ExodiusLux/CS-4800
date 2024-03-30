package org.example;

public class Hotdog implements Food{
    private final double price = 3.0;
    @java.lang.Override
    public double getPrice() {
        return price;
    }

    @java.lang.Override
    public java.lang.String getDescription() {
        return "Hotdog";
    }
}
