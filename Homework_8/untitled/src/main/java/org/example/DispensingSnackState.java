package org.example;
import java.util.HashMap;
import java.util.Map;
public class DispensingSnackState implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectSnack(String snackName) {
        System.out.println("Already dispensing a snack. Please wait.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Already dispensing a snack. Please wait.");
    }

    @Override
    public void dispenseSnack() {
        Map<String, Snack> snacks = vendingMachine.getSnacks();
        double currentBalance = vendingMachine.getCurrentBalance();

        Snack selectedSnack = snacks.get(vendingMachine.getSelectedSnack());

        if (selectedSnack != null && selectedSnack.getQuantity() > 0 && currentBalance >= selectedSnack.getPrice()) {
            System.out.println("Dispensing " + selectedSnack.getName());
            selectedSnack.setQuantity(selectedSnack.getQuantity() - 1);
            vendingMachine.setCurrentBalance(currentBalance - selectedSnack.getPrice());
        }
        else if (selectedSnack != null && currentBalance < selectedSnack.getPrice()) {
            System.out.println("Sorry, insufficient balance");
        }
        else{
            System.out.println("Sorry item is not available.");
        }
        vendingMachine.setSelectedSnack("");
        vendingMachine.setState(new IdleState(vendingMachine));
    }
}
