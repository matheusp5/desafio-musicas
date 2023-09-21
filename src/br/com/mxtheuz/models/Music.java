package br.com.mxtheuz.models;

import br.com.mxtheuz.models.abstracts.Title;
import br.com.mxtheuz.models.contracts.Sound;

public class Music extends Title implements Sound {
    private String album;
    private int likes = 0;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void Start() {
        System.out.println("Started " + this.name);
        this.views++;
    }

    @Override
    public void Like() {
        System.out.println("Like!");
        this.likes++;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + ", album: " + this.album;
    }
}
