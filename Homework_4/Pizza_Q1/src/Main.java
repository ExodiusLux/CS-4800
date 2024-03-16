public class Main {
    public static void main(String[] args){
        Pizza persnl_P1 = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize(Size.Large).addTopping(Toppings.Pepperoni).addTopping(Toppings.Sausage)
                .addTopping(Toppings.Mushrooms).build();

        Pizza persnl_P2 = new PizzaBuilder().setPizzaChain("Pizza Hut").addTopping(Toppings.Pepperoni).addTopping(Toppings.Sausage)
                .addTopping(Toppings.Mushrooms).addTopping(Toppings.Ham).addTopping(Toppings.Beef).addTopping(Toppings.Chicken).build();

        Pizza persnl_P3 = new PizzaBuilder().setPizzaChain("Pizza Hut").addTopping(Toppings.Pepperoni).addTopping(Toppings.Sausage)
                .addTopping(Toppings.Mushrooms).addTopping(Toppings.Ham).addTopping(Toppings.Beef).addTopping(Toppings.Chicken).addTopping(Toppings.ExtraCheese).addTopping(Toppings.Bacon)
                .addTopping(Toppings.Pesto).build();




        Pizza lrg_3topping_P = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize(Size.Large).addTopping(Toppings.Pepperoni).addTopping(Toppings.Sausage)
                .addTopping(Toppings.Mushrooms).build();

        Pizza sml_2topping =  new PizzaBuilder().setPizzaChain("Pizza Hut").setSize(Size.Small).addTopping(Toppings.Mushrooms).addTopping(Toppings.Olives).build();
        lrg_3topping_P.eat();
        sml_2topping.eat();

        Pizza med_8topping = new PizzaBuilder().setPizzaChain("Little Ceasars").setSize(Size.Medium).addTopping(Toppings.ExtraCheese).addTopping(Toppings.Mushrooms).addTopping(Toppings.Bacon)
                .addTopping(Toppings.Chicken).addTopping(Toppings.Pepperoni).addTopping(Toppings.Ham).addTopping(Toppings.Beef).addTopping(Toppings.Chicken).build();

        Pizza sml_6topping = new PizzaBuilder().setPizzaChain("Little Ceasars").setSize(Size.Small).addTopping(Toppings.Pepperoni).addTopping(Toppings.TomatoandBasil).addTopping(Toppings.Onions)
                        .addTopping(Toppings.Spinach).addTopping(Toppings.Pesto).addTopping(Toppings.Peppers).build();

        med_8topping.eat();
        sml_6topping.eat();

        Pizza sml_1topping = new PizzaBuilder().setPizzaChain("Dominos").setSize(Size.Small).addTopping(Toppings.HamandPineapple).build();
        Pizza lrg_3topping_d = new PizzaBuilder().setPizzaChain("Dominos").setSize(Size.Large).addTopping(Toppings.SpicyPork).addTopping(Toppings.Pepperoni).addTopping(Toppings.Sausage).build();

        sml_1topping.eat();
        lrg_3topping_d.eat();
    }
}
