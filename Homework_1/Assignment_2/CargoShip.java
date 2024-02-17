package Homework_1.Assignment_2;

public class CargoShip extends Ship{
    int cargo_capacity;
    
    CargoShip(String ship_name, String year_built, int cargo_capacity){
        super(ship_name, year_built);
        this.cargo_capacity = cargo_capacity;
    }
    public int getCargoCapacity() {
        return cargo_capacity;
    }

    public void setCargoCapacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cargo Capacity: " + cargo_capacity + " tons");
    }
}
