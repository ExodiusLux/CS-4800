package org.example;

public class Main {
    public static void main(String[] args) {
            VendingMachine vendingMachine = new VendingMachine();


            vendingMachine.setState(new IdleState(vendingMachine));
            vendingMachine.selectSnack("Snickers");

            vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
            vendingMachine.insertMoney(2.0);

            vendingMachine.setState(new DispensingSnackState(vendingMachine));
            vendingMachine.dispenseSnack();

            vendingMachine.selectSnack("KitKat");

            vendingMachine.setState(new DispensingSnackState(vendingMachine));
            vendingMachine.dispenseSnack();

            vendingMachine.selectSnack("Coke");

            vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
            vendingMachine.insertMoney(2.0);

            vendingMachine.setState(new DispensingSnackState(vendingMachine));
            vendingMachine.dispenseSnack();
    }
}