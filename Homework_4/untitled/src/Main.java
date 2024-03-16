public class Main {
    public static void main(String[] args){
        Pizza Lrg_3topping = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize(Size.Large).addTopping("Pepperoni").addTopping("Sausage")
                .addTopping("Mushroom").build();

        Pizza sml_2topping =  new PizzaBuilder().setPizzaChain("Pizza Hut").setSize(Size.Small).addTopping("Mushrooms").addTopping("Olives").build();
        Lrg_3topping.eat();
        sml_2topping.eat();

        Pizza med_8topping = new PizzaBuilder().setPizzaChain("Little Ceasars").setSize(Size.Medium).addTopping("Extra Cheese").addTopping("Mushroom").addTopping("Bacon")
                .addTopping("Sausage").addTopping("Pepperoni").addTopping("Ham").addTopping("Beef").addTopping("Chicken").build();

        Pizza sml_6topping = new PizzaBuilder().setPizzaChain("Little Ceasars").setSize(Size.Small).addTopping("Pepperoni").build();
    }
}
