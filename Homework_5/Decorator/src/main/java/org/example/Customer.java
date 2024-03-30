package org.example;

public class Customer {
    private String name;
    private LoyaltyStatus loyaltystatus;

    private Order order;

    public Customer(String name, boolean status){
        this.name = name;
        loyaltystatus = new LoyaltyStatus(status);
        order = new Order();
    }

    public void PlaceOrder(Food food){
        order.addItem(food);
    }

    public double getOrderTotal(){
        if(loyaltystatus.getStatus()){
            return order.getTotal() * .90; //10 percent discount
        }
        else{
            return order.getTotal();
        }
    }

    public void changeLoyaltyStatus(boolean status){
        loyaltystatus.setMember(status);
    }

    public boolean getLoyaltyStatus(){
        return loyaltystatus.getStatus();
    }
}
