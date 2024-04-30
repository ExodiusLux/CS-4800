import org.example.CharacterProperties;
import org.example.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CharacterTest {
    CharacterProperties prop = new CharacterProperties("Test Font", 16, "White");
    Character ch = new Character('T', prop);

    @Test
    public void testDisplay(){
        String expected = "Character: T, Font: Test Font, Size: 16, Color: White";
        String actual = ch.display();
        assertEquals(expected, actual);
    }

    @Test
    public void testRender(){
        char expected = 'T';
        char actual = ch.render();
        assertEquals(expected, actual);
    }




}

