import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String pizza_Chain;
    private String size;
    private List<String> toppings;

    public PizzaBuilder setPizzaChain(String pizza_Chain){
        this.pizza_Chain = pizza_Chain;
        return this;
    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        if(this.toppings == null){
            List<String> toppings = new ArrayList<>();
        }
        assert this.toppings != null;

        this.toppings.add(topping);
        return this;
    }

    public Pizza build(){
        return new Pizza(pizza_Chain, size, toppings);
    }
}
