package org.example;

import java.util.Objects;

public class IdleState implements StateOfVendingMachine{
    VendingMachine vendingMachine;

    IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectSnack(String snackName){
        if(Objects.equals(snackName, "")){
            System.out.println("No Snack Selected Please select a snack");
        }
        else if (vendingMachine.getSnacks().containsKey(snackName)) {
            System.out.println("Snack selected: " + snackName);
            vendingMachine.setSelectedSnack(snackName);
            vendingMachine.setState(new WaitingForMoneyState(this.vendingMachine));
        }
        else{
            System.out.println("Unknown Snack selected please selected an available snack");
        }
    }

    @Override
    public void insertMoney(double amount){
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack(){
        System.out.println("Please select a snack and insert money first.");
    }
}
