package Homework_1.Assignment_2;

public class ship_driver {
    public static void main(String[] args) {
        Ship[] ship_arr = new Ship[3];
        Ship base_ship = new Ship("Admire", "1997");
        CruiseShip cruise_ship = new CruiseShip("Carnival Cruise", "2019", 3000);
        CargoShip cargo_ship = new CargoShip("Tankers", "2011", 200000);

        ship_arr[0] = base_ship;
        ship_arr[1] = cruise_ship;
        ship_arr[2] = cargo_ship;

        for(Ship ship: ship_arr){
            ship.print();
            System.out.println();
        }

    }
}
