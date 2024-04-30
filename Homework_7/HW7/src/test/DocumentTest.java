import org.example.CharacterProperties;
import org.example.Character;
import org.example.CharacterPropertiesFact;
import org.example.Document;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DocumentTest {
    Document doc = new Document();
    CharacterProperties prop = new CharacterProperties("Arial", 16, "Black");
    Character ch = new Character('T', prop);

    @Test
    public void testaddCharacter(){
        Document expected_doc = new Document();
        expected_doc.addCharacter(new Character('T', new CharacterProperties("Arial", 16, "Black")));

        doc.addCharacter(ch);

        List<Character> expected = expected_doc.getCharacters();
        List<Character> actual = doc.getCharacters();
        assertEquals(expected, actual);
    }
}
