package br.com.mxtheuz.factories;

import br.com.mxtheuz.models.Music;
import br.com.mxtheuz.models.Playlist;

import java.util.ArrayList;

public class PlaylistFactory {
    public static Playlist create(String name, String creator, ArrayList<Music> musics) {
        Playlist playlist = new Playlist();
        playlist.setName(name);
        playlist.setCreator(creator);
        playlist.setMusics(musics);
        playlist.setDurationInSeconds(playlist.getTotalSeconds());
        return playlist;
    }
}
