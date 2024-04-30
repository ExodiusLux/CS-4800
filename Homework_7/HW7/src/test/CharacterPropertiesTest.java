import org.example.CharacterProperties;
import org.example.Character;
import org.example.CharacterPropertiesFact;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CharacterPropertiesTest {
    CharacterProperties prop = new CharacterProperties("Ariel", 16, "Black");

    @Test
    public void testgetFont(){
        String expected = "Ariel";
        String actual = prop.getFont();
        assertEquals(expected, actual);
    }

    @Test
    public void testgetSize(){
        int expected = 16;
        int actual = prop.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testgetColor(){
        String expected = "Black";
        String actual = prop.getColor();
        assertEquals(expected,actual);
    }
}
