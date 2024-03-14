public class Driver {
    public static void Main(String args){
        Pizza pizza = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("small").addTopping("Pepperoni").addTopping("Sausage")
                .addTopping("Mushroom").build();
    }
}
