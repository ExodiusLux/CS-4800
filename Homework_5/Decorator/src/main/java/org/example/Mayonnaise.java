package org.example;

public class Mayonnaise extends ToppingsDecorator{
    private final double price = 0.3;

    public Mayonnaise(Food food){
        super(food);
    }

    @Override
    public double getPrice(){
       return food.getPrice() + price;
    }

    @Override
    public String getDescription(){
        return food.getDescription() + " with Mayonnaise";
    }
}
