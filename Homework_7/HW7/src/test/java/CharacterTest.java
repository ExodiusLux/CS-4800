import org.example.Character;
import org.example.CharacterProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CharacterTest {
    CharacterProperties prop = new CharacterProperties("Arial", 16, "Black");
    Character character = new Character('T', prop);

    @Test
    public void testRender(){
        char expected = 'T';
        char actual = character.render();
        assertEquals(expected,actual);
    }

    @Test
    public void testDisplay(){
        String expected = "Character: T, Font: Arial, Size: 16, Color: Black";
        String actual = character.display();
    }
}
