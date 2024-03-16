import java.util.List;
public class Pizza{
    private final String pizza_Chain;
    private final Size size;
    private final List<String> toppings;

    public Pizza(String pizza_Chain, Size size, List<String> toppings){
        this.pizza_Chain = pizza_Chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat(){
        System.out.println(pizza_Chain + ":" + size + " {" + toppings + "}");
    }
}
