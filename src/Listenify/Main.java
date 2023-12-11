package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Album a1 = new Album("MoonChild Era","Diljit Dosanjh");

        a1.addNewSong("Champagne",3.02);
        a1.addNewSong("Lover",4.2);
        a1.addNewSong("Vibe",2.36);
        a1.addNewSong("Black and White",4.05);

        Album a2 = new Album("Arijit Songs","Arijit Singh");

        a2.addNewSong("Apna Bana Le",3.4);
        a2.addNewSong("Agar Tum saath ho",5.3);
        a2.addNewSong("Uska hi bana",4.5);
        a2.addNewSong("Chaleya ",5.98);
        a2.addNewSong("Channa mereya",3.4);
        a2.addNewSong("Khairiyat",3.4);


        List<Song> playlist = new ArrayList<>();

        a1.addToPlayList(playlist,1);
        a1.addToPlayList(playlist,4);
        a2.addToPlayList(playlist,"Apna Bana Le");
        a2.addToPlayList(playlist,"Uska hi bana");
        a2.addToPlayList(playlist,"Channa mereya");

    }
}