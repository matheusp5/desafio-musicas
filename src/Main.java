import br.com.mxtheuz.factories.MusicFactory;
import br.com.mxtheuz.factories.PlaylistFactory;
import br.com.mxtheuz.models.Music;
import br.com.mxtheuz.models.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Music music1 = MusicFactory.create("Agudo Mágico 4", 183, "Mc K.K");
        Music music2 = MusicFactory.create("Agudo Mágico 3", 233, "Mc K.K");
        Music music3 = MusicFactory.create("Starboy", 314, "The Weeknd", "Draft Punk");

        music1.Like();
        music1.Like();
        music2.Like();
        music2.Like();
        music2.Like();
        music3.Like();

        Playlist playlist = PlaylistFactory.create("Minha playlist", "Matheus Piccoli", new ArrayList<>() {{ add(music1); add(music2); add(music3); }});

        music1.Start();
        System.out.println(music1);
        System.out.println(music2);
        System.out.println(music3);
    }
}