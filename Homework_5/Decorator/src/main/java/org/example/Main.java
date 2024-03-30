package org.example;

public class Main {
    public static void main(String[] args) {
        Customer dave = new Customer("dave", false);
        dave.PlaceOrder(new Mayonnaise(new Burger()));
        dave.PlaceOrder(new Ketchup(new Fries()));

        System.out.println(dave.getOrderTotal());

        Customer frank = new Customer("frank", true);
        frank.PlaceOrder(new Mayonnaise(new Burger()));
        frank.PlaceOrder(new Ketchup(new Fries()));

        System.out.println(frank.getOrderTotal());

        Customer anne = new Customer("anne", false);
        anne.PlaceOrder(new Hotdog());
        anne.PlaceOrder(new Mustard(new Burger()));
        anne.PlaceOrder(new Ketchup(new Fries()));

        System.out.println(anne.getOrderTotal());
    }
}