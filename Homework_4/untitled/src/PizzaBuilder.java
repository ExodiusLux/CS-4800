import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String pizza_Chain;
    private Size size;
    private final List<String> toppings;
    public PizzaBuilder(){
        toppings = new ArrayList<>();
    }
    public PizzaBuilder setPizzaChain(String pizza_Chain){
        this.pizza_Chain = pizza_Chain;
        return this;
    }

    public PizzaBuilder setSize(Size size){
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        this.toppings.add(topping);
        return this;
    }

    public Pizza build(){
        return new Pizza(pizza_Chain, size, toppings);
    }
}
