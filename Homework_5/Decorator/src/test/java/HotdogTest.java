import org.example.Hotdog;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class HotdogTest {
    Hotdog hotdog = new Hotdog();

    @Test
    public void TestHotdogPrice(){
        double expected = 3.0;
        double actual = hotdog.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void TestHotdogDescription(){
        String expected = "Hotdog";
        String actual = hotdog.getDescription();
        assertEquals(expected, actual);
    }
}
