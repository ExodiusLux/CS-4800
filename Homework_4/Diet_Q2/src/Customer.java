public class Customer {
    private final String name;
    private final DietType diet;

    public Customer(String name, DietType diet){
        this.name = name;
        this.diet = diet;
    }

    public String getName(){
        return name;
    }

    public DietType getDiet() {
        return diet;
    }

}
