package br.com.mxtheuz.models;

import br.com.mxtheuz.models.abstracts.Title;
import br.com.mxtheuz.models.contracts.Sound;

public class Podcast extends Title implements Sound {
    private int episode;
    private String guest;
    private int likes;

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
        return this.name + ": Episódio " + this.episode + ". Convidado(s): " + guest;
    }
}
