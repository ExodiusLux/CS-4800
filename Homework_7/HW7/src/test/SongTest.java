import org.example.CharacterProperties;
import org.example.Character;
import org.example.Song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SongTest {
    Song song = new Song(1, "Test Song", "Tester", "Test Album", 100);

    @Test
    public void testgetID(){
        int expected = 1;
        int actual = song.getId();
        assertEquals(expected,actual);
    }

    @Test
    public void testgetTitle(){
        String expected = "Test Song";
        String actual = song.getTitle();
        assertEquals(expected,actual);
    }

    @Test
    public void testgetArtist(){
        String expected = "Tester";
        String actual = song.getArtist();
        assertEquals(expected,actual);
    }

    @Test
    public void testgetDuration(){
        int expected = 100;
        int actual = song.getDuration();
        assertEquals(expected,actual);
    }





}
