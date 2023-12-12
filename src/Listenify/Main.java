package Listenify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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


        int currIndex = 0;

        printMenu();

        System.out.println("Now playList "+playlist.get(currIndex).toString());

        playPlayList(playlist);
    }

    public static void playPlayList(List<Song> playList) {

        Scanner sc = new Scanner(System.in);


        int currInd = 0;


        boolean quit = false;

        while(quit==false){

            int choice = sc.nextInt();

            switch (choice){

                case 1 :
                    currInd = currInd+1;
                    if(currInd%playList.size()==0)
                        currInd = 0;
                    System.out.println("Now Playing "+playList.get(currInd).toString());
                    break;
                case 2 :
                    currInd = currInd - 1;
                    if(currInd==-1)
                        currInd = 0;
                    System.out.println("Now Playing "+playList.get(currInd).toString());
                    break;
                case 3:
                    System.out.println("Now Playing "+playList.get(currInd).toString());
                    break;
                case 4:
                    Collections.shuffle(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    printPlayList(playList);
                    break;
                case 7:
                    playList.remove(currInd);
                    System.out.println("The current Song has been deleted");
                    break;
                case 8:
                    quit = true;
                    break;
            }


        }

    }
    public static void printPlayList(List<Song> playList){

        for(Song song:playList){
            System.out.println(song.toString());
        }
    }


    public static void printMenu(){

        System.out.println("<<<--------------->>>");
        System.out.println("1. Play the next Song");
        System.out.println("2. Play the previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Shuffle the playList");
        System.out.println("5. Print the menu !!");
        System.out.println("6. Print PlayList");
        System.out.println("7. Delete the current Song");
        System.out.println("8. Exit the System");
        System.out.println("<<<--------------->>>");
        System.out.println("Enter your choice");
    }
}