package com.mtechviral.musicplayer;

/**
 * Created by pawankumar on 30/05/17.
 */

public class SongInfo {
    private String Songname;
    private String Artistname;
    private String SongUrl;

    public SongInfo() {
    }

    public SongInfo(String songname, String artistname, String songUrl) {
        Songname = songname;
        Artistname = artistname;
        SongUrl = songUrl;
    }

    public String getSongname() {
        return Songname;
    }

    public void setSongname(String songname) {
        Songname = songname;
    }

    public String getArtistname() {
        return Artistname;
    }

    public void setArtistname(String artistname) {
        Artistname = artistname;
    }

    public String getSongUrl() {
        return SongUrl;
    }

    public void setSongUrl(String songUrl) {
        SongUrl = songUrl;
    }
}
