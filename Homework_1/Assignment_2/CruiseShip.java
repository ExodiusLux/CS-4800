package Homework_1.Assignment_2;

public class CruiseShip extends Ship {
    int max_passengers;
    
    CruiseShip(String ship_name, String year_built, int max_passengers){
        super(ship_name, year_built);
        this.max_passengers = max_passengers;
    }
    public int getMaxPassengers() {
        return max_passengers;
    }

    public void setMaxPassengers(int max_passengers) {
        this.max_passengers = max_passengers;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Max Passengers: " + max_passengers);
    }
}
