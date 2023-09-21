package br.com.mxtheuz.factories;

import br.com.mxtheuz.models.Music;

public class MusicFactory {
    public static Music create(String name, int durationInSeconds, String creator, String album) {
        Music music = new Music();
        music.setName(name);
        music.setDurationInSeconds(durationInSeconds);
        music.setCreator(creator);
        music.setAlbum(album);
        return music;
    }

    public static Music create(String name, int durationInSeconds, String creator) {
        Music music = new Music();
        music.setName(name);
        music.setDurationInSeconds(durationInSeconds);
        music.setCreator(creator);
        music.setAlbum(name);
        return music;
    }
}
