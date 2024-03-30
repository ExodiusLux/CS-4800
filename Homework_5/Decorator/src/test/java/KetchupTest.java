import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class KetchupTest {
    Food BurgerwithKetchup = new Ketchup(new Burger());
    Food HotdogwithKetchup = new Ketchup(new Hotdog());

    Food FrieswithKetchup = new Ketchup(new Fries());

    @Test
    public void TestBurgerwithKetchupPrice(){
        double expected = 5.5;
        double actual = BurgerwithKetchup.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void TestHotdogwithKetchupPrice(){
        double expected = 3.5;
        double actual = HotdogwithKetchup.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void TestFrieswithKetchupPrice(){
        double expected = 2.0;
        double actual = FrieswithKetchup.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void TestBurgerwithKetchupDesc(){
        String expected = "Burger with Ketchup";
        String actual = BurgerwithKetchup.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void TestHotdogwithKetchupDesc(){
        String expected = "Hotdog with Ketchup";
        String acutal = HotdogwithKetchup.getDescription();
        assertEquals(expected, acutal);
    }

    @Test
    public void TestFrieswithKetchupDesc(){
        String expected = "Fries with Ketchup";
        String acutal = FrieswithKetchup.getDescription();
        assertEquals(expected, acutal);
    }
}
