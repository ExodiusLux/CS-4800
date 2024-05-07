package org.example;

public class WaitingForMoneyState implements StateOfVendingMachine{
    private VendingMachine vendingMachine;

    WaitingForMoneyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectSnack(String snackName) {
        System.out.println("Already selected a snack. Please insert money.");

    }

    @Override
    public void insertMoney(double amount) {
        double currentBalance = vendingMachine.getCurrentBalance() + amount;
        vendingMachine.setCurrentBalance(currentBalance);
        System.out.println("Added Balance: $" + amount + " Current balance: $" + currentBalance);
        vendingMachine.setState(new DispensingSnackState(this.vendingMachine));
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Money inserted. Please wait for the snack to be dispensed.");
        vendingMachine.setState(new DispensingSnackState(this.vendingMachine));
    }
}
