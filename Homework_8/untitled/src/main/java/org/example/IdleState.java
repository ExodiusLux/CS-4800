package org.example;

public class IdleState implements StateOfVendingMachine{
    @Override
    public void selectSnack(String snackName){
        System.out.println("Snack selected: " + snackName);
    }

    @Override
    public void insertMoney(double amount){
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack(){
        System.out.println("Please select a snack and insert money.");
    }
}
