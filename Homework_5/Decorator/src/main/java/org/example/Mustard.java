package org.example;

public class Mustard extends ToppingsDecorator{
    private final double price = 0.4;
    public Mustard(Food food){
        super(food);
    }

    @Override
    public double getPrice(){
        return food.getPrice() + price;
    }

    @Override public String getDescription(){
        return food.getDescription() + " with Mustard";
    }
}
