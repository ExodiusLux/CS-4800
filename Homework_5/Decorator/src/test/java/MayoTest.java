import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MayoTest {
    Food BurgerwithMayo = new Mayonnaise(new Burger());
    Food HotdogwithMayo = new Mayonnaise(new Hotdog());
    Food FrieswithMayo = new Mayonnaise(new Fries());

    @Test
    public void TestBurgerwithMayoPrice(){
        double expected = 5.3;
        double actual = BurgerwithMayo.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestHotdogwithMayoPrice(){
        double expected = 3.3;
        double actual = HotdogwithMayo.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestFrieswithMayoPrice(){
        double expected = 1.8;
        double actual = FrieswithMayo.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestBurgerwithMayoDesc(){
        String expected = "Burger with Mayonnaise";
        String actual = BurgerwithMayo.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void TestHotdogwithMayoDesc(){
        String expected = "Hotdog with Mayonnaise";
        String actual = HotdogwithMayo.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void TestFrieswithMayoDesc(){
        String expected = "Fries with Mayonnaise";
        String actual = FrieswithMayo.getDescription();
        assertEquals(expected, actual);
    }
}
