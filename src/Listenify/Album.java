package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String albumName;

    private String artistName;

    private List<Song> songList;
    //Instead of a List<Song> we can also maintain a HashMap for the same

    public Album(String albumName,String artistName){
        this.albumName = albumName;
        this.artistName = artistName;
        songList = new ArrayList<>();
    }

    public Album(String artistName,List<Song> songList,String albumName){
        this.artistName = artistName;
        this.albumName = albumName;
        this.songList = songList;
    }

    public Boolean findSong(String title){

        //Find if the song with entered title is present in the songList
        //of this album or not

        //return T/F
        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public String addNewSong(String title,double duration){

        if(findSong(title)==false) {
            Song newSong = new Song(title,duration);
            songList.add(newSong);
            return "New Song has been added to the Song List";
        }else{
            return "The Song is already present in the song List";
        }
    }

    public void addToPlayList(List<Song> playList,int songNo){

        int index = songNo - 1;
        if(index<songList.size()) {
            Song song = songList.get(index);
            playList.add(song);
        }
    }

    public String addToPlayList(List<Song> playList,String title){

        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return "Song added successfully";
            }
        }

        return "No Song found";

    }







}
