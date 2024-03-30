import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MustardTest {
    Food BurgerwithMustard = new Mustard(new Burger());
    Food HotdogwithMustard = new Mustard(new Hotdog());
    Food FrieswithMustard = new Mustard(new Fries());

    @Test
    public void TestBurgerwithMustardPrice(){
        double expected = 5.4;
        double actual = BurgerwithMustard.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void TestHotdogwithMustardPrice(){
        double expected = 3.4;
        double actual = HotdogwithMustard.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void TestFrieswithMustardPrice(){
        double expected = 1.9;
        double actual = FrieswithMustard.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestBurgerwithMustardDesc(){
        String expected = "Burger with Mustard";
        String actual = BurgerwithMustard.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void TestHotdogwithMustardDesc(){
        String expected = "Hotdog with Mustard";
        String actual = HotdogwithMustard.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void TestFrieswithMustardDesc(){
        String expected = "Fries with Mustard";
        String actual = FrieswithMustard.getDescription();
        assertEquals(expected, actual);
    }
}
