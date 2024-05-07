package org.example;

public class Main {
    public static void main(String[] args) {
            VendingMachine vendingMachine = new VendingMachine();

            vendingMachine.selectSnack("Coke");

            vendingMachine.insertMoney(2.0);

            vendingMachine.dispenseSnack();


            vendingMachine.selectSnack("Pepsi");

            vendingMachine.insertMoney(2.0);

            vendingMachine.dispenseSnack();


            vendingMachine.selectSnack("Cheetos");

            vendingMachine.insertMoney(2.0);

            vendingMachine.dispenseSnack();


            vendingMachine.selectSnack("Doritos");

            vendingMachine.insertMoney(2.0);

            vendingMachine.dispenseSnack();


            vendingMachine.selectSnack("KitKat");

            vendingMachine.insertMoney(2.0);

            vendingMachine.dispenseSnack();
            

            vendingMachine.selectSnack("Snickers");

            vendingMachine.insertMoney(1.75);

            vendingMachine.dispenseSnack();

    }
}