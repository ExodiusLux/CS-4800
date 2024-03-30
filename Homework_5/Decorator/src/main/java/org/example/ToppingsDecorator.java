package org.example;

public abstract class ToppingsDecorator implements Food{
    protected Food food;

    public ToppingsDecorator(Food food){
        this.food = food;
    }

    @Override
    public double getPrice(){
        return food.getPrice();
    }
    @Override
    public String getDescription(){
        return food.getDescription();
    }


}
