package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ProxySongService implements SongService{
    private StreamingSongService streamingSongService;
    private HashMap<Integer, Song> songCache;

    public ProxySongService (){
        this.streamingSongService = new StreamingSongService();
        this.songCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song song = songCache.get(songID);
        if (song == null){
            song = streamingSongService.searchById(songID);
            songCache.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return streamingSongService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return streamingSongService.searchByAlbum(album);
    }
}
