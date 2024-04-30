import org.example.CharacterProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CharacterPropertiesTest {
    CharacterProperties prop = new CharacterProperties("Arial", 16, "Black");

    @Test
    public void getFont(){
        String expected = "Arial";
        String actual = prop.getFont();
        assertEquals(expected,actual);
    }

    @Test
    public void getSize(){
        int expected = 16;
        int actual = prop.getSize();
        assertEquals(expected,actual);
    }

    @Test
    public void getColor(){
        String expected = "Black";
        String actual = prop.getColor();
        assertEquals(expected,actual);
    }
}
