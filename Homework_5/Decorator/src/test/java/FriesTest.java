import org.example.Fries;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class FriesTest {
    Fries fries = new Fries();

    @Test
    public void TestFriesPrice(){
        double expected = 1.50;
        double actual = fries.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestFriesDescription(){
        String expected = "fries";
        String actual = fries.getDescription();
        assertEquals(expected, actual);
    }
}
