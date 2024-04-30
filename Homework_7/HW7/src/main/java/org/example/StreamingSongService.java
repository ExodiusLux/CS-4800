package org.example;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class StreamingSongService implements SongService {
    private Map<Integer, Song> songMap;

    public StreamingSongService(){
        this.songMap = new HashMap<Integer, Song>();

        this.addSong(new Song(1, "The First Song", "The First Artist", "The First Album", 200));
        this.addSong(new Song(2, "2nd times the try", "The First Artist", "The First Album", 180));
        this.addSong(new Song(3, "3 is the best number", "Ar3tist", "Reflections", 220));
        this.addSong(new Song(4, "3rd times the charm", "The First Artist", "The First Album", 360));
        this.addSong(new Song(5, "33 is two Threes", "Ar3tist", "Reflections", 300));
        this.addSong(new Song(6, "66", "Route66", "One off from Lucky", 450));
        this.addSong(new Song(7, "777", "Lu77y", "Take it all", 425));
        this.addSong(new Song(8, "Snowman", "Artist8", "infinity", 500));
        this.addSong(new Song(9, "Almost Double Digits", "Record9", "Highest Single", 340));
        this.addSong(new Song(10, "10 to the power of 1", "one and zero", "5 time 2", 330));
    }

    private void addSong(Song song){
        songMap.put(song.getId(), song);
    }

    public Song searchById(Integer songID){
        delay();
        return songMap.get(songID);
    }

    public List<Song> searchByTitle(String title){
        List<Song> searchResults = new ArrayList<>();
        delay();
        for (Map.Entry<Integer, Song> entry : songMap.entrySet()){
            if(entry.getValue().getTitle().equals(title)){
                searchResults.add(songMap.get(entry.getKey()));
            }
        }
        if(searchResults.isEmpty()){
            System.out.println("Unable to locate requested song(s)");
        }
        return searchResults;
    }

    public List<Song> searchByAlbum(String album){
        List<Song> searchResults = new ArrayList<>();
        delay();
        for (Map.Entry<Integer, Song> entry : songMap.entrySet()){
            if(entry.getValue().getAlbum().equals(album)){
                searchResults.add(songMap.get(entry.getKey()));
            }
        }
        if(searchResults.isEmpty()){
            System.out.println("Unable to locate requested song(s)");
        }
        return searchResults;
    }

    private void delay(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ignored) {}
    }

}
