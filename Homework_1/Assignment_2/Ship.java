package Homework_1.Assignment_2;

public class Ship {
    String ship_name;
    String year_built;

    Ship(String ship_name, String year_built){
        this.ship_name = ship_name;
        this.year_built = year_built;
    }
    public void print(){
        System.out.println("Ship Name: " + ship_name );
        System.out.println("Year Built: " + year_built);
    }
    public String getName() {
        return ship_name;
    }

    public void setName(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getYearBuilt() {
        return year_built;
    }

    public void setYearBuilt(String year_built) {
        this.year_built = year_built;
    }
}
