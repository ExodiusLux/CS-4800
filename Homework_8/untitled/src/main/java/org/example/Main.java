package org.example;

public class Main {
    public static void main(String[] args) {
            VendingMachine vendingMachine = new VendingMachine();

            // Chain of Responsibility
            vendingMachine.setState(new IdleState());
            vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
            vendingMachine.setState(new DispensingSnackState(vendingMachine));

            // Simulate user actions
            vendingMachine.selectSnack("Snickers");
            vendingMachine.insertMoney(2.0);
            vendingMachine.dispenseSnack();
    }
}