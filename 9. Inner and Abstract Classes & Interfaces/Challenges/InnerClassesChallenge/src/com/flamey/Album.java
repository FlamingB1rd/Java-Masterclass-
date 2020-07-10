package com.flamey;

import java.util.ArrayList;
import java.util.LinkedList;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.

public class Album
{
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration)
    {
        return this.songs.add(new Song(title, duration));
    }


    public boolean addSongToPlaylist(String songTitle, LinkedList<Song> playList)
    {
        Song songToAdd = this.songs.findSong(songTitle);
        if (songToAdd != null)
        {
            playList.add(songToAdd);
            return true;
        }
        System.out.println("The song " + songTitle + " is not present in this Album!");
        return false;
    }


    private class SongList
    {
        private ArrayList<Song> songs;

        public SongList()
        {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song)
        {
            if(this.songs.contains(song))
            {
                return false;
            }
            else
            {
                this.songs.add(song);
                return true;
            }
        }

        private Song findSong(String songName)
        {
            for (Song checkedSong : this.songs)
            {
                if (checkedSong.getTitle().equalsIgnoreCase(songName))
                {
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
