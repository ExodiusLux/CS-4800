import org.example.Song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SongTest {
    Song song = new Song(1,"the","song", "test", 100);

    @Test
    public void testgetID(){
        int expected = 1;
        int actual = song.getId();
        assertEquals(expected,actual);
    }

    @Test void testgetTitle(){
        String expected = "the";
        String actual = song.getTitle();
        assertEquals(expected,actual);
    }
    @Test void testgetArtist(){
        String expected = "song";
        String actual = song.getArtist();
        assertEquals(expected,actual);
    }

    @Test void testgetAlbum(){
        String expected = "test";
        String actual = song.getAlbum();
        assertEquals(expected, actual);
    }

    @Test void testgetDuration(){
        int expected = 100;
        int actual = song.getDuration();
        assertEquals(expected,actual);
    }

    @Test void toStringTest(){
        String expected = "the, song, test, 100";
        String actual = song.toString();
    }
}
