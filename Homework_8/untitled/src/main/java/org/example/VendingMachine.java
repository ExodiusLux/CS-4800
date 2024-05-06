package org.example;
import java.util.Map;
import java.util.HashMap;

public class VendingMachine implements StateOfVendingMachine{
    private StateOfVendingMachine state;
    private HashMap<String, Snack> snacks;
    private double currentBalance;

    private String selectedSnack;
    public VendingMachine(){
        state = new IdleState(this);
        snacks = new HashMap<String, Snack>();
        snacks.put("Coke", new Snack("Coke", 1.5, 10));
        snacks.put("Pepsi", new Snack("Pepsi", 1.25, 5));
        snacks.put("Cheetos", new Snack("Cheetos", 2.0, 7));
        snacks.put("Doritos", new Snack("Doritos", 2.25, 8));
        snacks.put("KitKat", new Snack("KitKat", 1.75, 6));
        snacks.put("Snickers", new Snack("Snickers", 1.85, 0));
    }

    @Override
    public void selectSnack(String snackName){
        state.selectSnack(snackName);
    }
    @Override
    public void insertMoney(double amount){
        state.insertMoney(amount);
    }
    @Override
    public void dispenseSnack() {
        state.dispenseSnack();
    }

    public void setState(StateOfVendingMachine state){
        this.state = state;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    public HashMap<String, Snack> getSnacks(){
        return snacks;
    }

    public String getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }
}
