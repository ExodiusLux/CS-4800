import java.util.List;
public class Pizza{
    private String pizza_Chain;
    private String size;
    private List<String> toppings;

    public Pizza(String pizza_Chain, String size, List<String> toppings){
        this.pizza_Chain = pizza_Chain;
        this.size = size;
        this.toppings = toppings;
    }

    public String eat(){
        return pizza_Chain + ":" + size + " {" + toppings + "}";
    }
}
