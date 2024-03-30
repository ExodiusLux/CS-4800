package org.example;

public class Ketchup extends ToppingsDecorator{
    private final double price = 0.5;

    public Ketchup(Food food){
        super(food);
    }

    @Override
    public double getPrice(){
        return food.getPrice() + price;
    }

    @Override
    public String getDescription(){
        return food.getDescription() + " with Ketchup";
    }
}
