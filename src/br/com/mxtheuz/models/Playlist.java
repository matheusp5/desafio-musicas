package br.com.mxtheuz.models;

import br.com.mxtheuz.models.abstracts.Title;

import java.util.ArrayList;

public class Playlist extends Title {
    private ArrayList<Music> musics;

    public ArrayList<Music> getMusics() {
        return musics;
    }

    public void setMusics(ArrayList<Music> musics) {
        this.musics = musics;
    }

    public int getTotalSeconds() {
        int seconds = 0;
        for(Music music : this.musics) {
            seconds += music.getDurationInSeconds();
        }
        return seconds;
    }

}
