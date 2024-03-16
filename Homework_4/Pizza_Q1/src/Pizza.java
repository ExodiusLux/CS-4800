import java.util.List;
public class Pizza{
    private final String pizza_Chain;
    private final Size size;
    private final List<Toppings> toppings;

    public Pizza(String pizza_Chain, Size size, List<Toppings> toppings){
        this.pizza_Chain = pizza_Chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat(){
        System.out.println("Pizza Chain: " + pizza_Chain + " Size:" + size + " Toppings: "+ toppings);
    }
}
