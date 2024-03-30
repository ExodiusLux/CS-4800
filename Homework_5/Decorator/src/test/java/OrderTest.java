import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class OrderTest {
    Food Burger = new Burger();
    Food Hotdog = new Hotdog();
    Food Fries = new Fries();

    Food BurgerwithMustard = new Mustard(new Burger());
    Food HotdogwithMayo = new Mayonnaise(new Hotdog());
    Food FrieswithKetchup = new Ketchup(new Fries());

    Order order;

    @Test
    public void TesttotalSingleItemRegular(){
        order = new Order();
        order.addItem(Burger);
        double expected = 5.0;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }
    @Test
    public void TesttotalTwoItemRegular(){
        order = new Order();
        order.addItem(Burger);
        order.addItem(Hotdog);
        double expected = 8.0;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void TesttotalThreeItemRegular(){
        order = new Order();
        order.addItem(Burger);
        order.addItem(Hotdog);
        order.addItem(Fries);
        double expected = 9.5;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    void TesttotalOneItemTopped(){
        order = new Order();
        order.addItem(BurgerwithMustard);
        double expected = 5.4;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    void TesttotalTwoItemTopped(){
        order = new Order();
        order.addItem(BurgerwithMustard);
        order.addItem(FrieswithKetchup);
        double expected = 7.4;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    void TesttotalThreeItemTopped(){
        order = new Order();
        order.addItem(BurgerwithMustard);
        order.addItem(FrieswithKetchup);
        order.addItem(HotdogwithMayo);
        double expected = 10.7;
        double actual = order.getTotal();
        assertEquals(expected, actual);
    }
}
