package org.example;

public class Song {
    private final Integer id;
    private final String title;
    private final String artist;
    private final String album;
    private final Integer duration;

    public Song(Integer id, String title, String artist, String album, Integer duration){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public String getArtist(){
        return artist;
    }

    public Integer getDuration() {
        return duration;
    }

    public String toString(){
        return getTitle() + ", " + getArtist() + ", " + getAlbum() + ", " + getDuration();
    }
}
