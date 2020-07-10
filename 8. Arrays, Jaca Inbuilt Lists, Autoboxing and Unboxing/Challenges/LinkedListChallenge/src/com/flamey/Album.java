package com.flamey;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }


    public boolean addSongToPlaylist(String songTitle, LinkedList<Song> playList)
    {
        Song songToAdd = findSong(songTitle);
        if(songToAdd != null)
        {
            playList.add(songToAdd);
            return true;
        }
        System.out.println("The song " + songTitle + " is not present in this Album!");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList)
    {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songs.size()))
        {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    private Song findSong(String songName)
    {
        for(Song checkedSong : this.songs)
        {
            if(checkedSong.getTitle().equalsIgnoreCase(songName))
            {
                return checkedSong;
            }
        }
        return null;
    }

}
