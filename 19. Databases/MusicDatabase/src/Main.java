import model.Artist;
import model.Datasource;
import model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Opening the connection
        Datasource datasource = new Datasource();
        if(!datasource.openConnection())
        {
            System.out.println("Can't open datasource!");
            return;
        }

        // if given an invalid argument by default goest to ORDER BY ASC
        //query Artists
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if(artists == null)
        {
            System.out.println("No artists!");
            return;
        }

        for(Artist artist : artists)
        {
            System.out.println("ID = " + artist.getID() + ", Name = " + artist.getName());
        }

        //query Albums by and artist
        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden", Datasource.ORDER_BY_ASC);
        if(albumsForArtist == null)
        {
            System.out.println("No albums!");
            return;
        }
        for(String album : albumsForArtist)
        {
            System.out.println(album);
        }

        //query Artists By a Song
        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        if(songArtists == null)
        {
            System.out.println("No artists!");
            return;
        }
        for (SongArtist artist : songArtists)
        {
            System.out.println("Artist: " + artist.getArtistName() + " || Album: " + artist.getAlbumName() + " || Track: " + artist.getTrack());
        }

        //Meta data for Songs Table
        datasource.querySongsMetaData();

        //Counting Songs
        datasource.getCount(Datasource.TABLE_SONGS);

        //Createing the View
        datasource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();
        //Querying the view
        songArtists = datasource.querySongInfoView(title);
        if(songArtists.isEmpty())
        {
            System.out.println("No artists!");
            return;
        }
        for (SongArtist artist : songArtists)
        {
            System.out.println("Artist: " + artist.getArtistName() + " || Album: " + artist.getAlbumName() + " || Track: " + artist.getTrack());
        }

        //Transaction:
        datasource.insertSong("Touch Of Grey", "Grateful Dead", "In The Dark", 1);

        //Closing the connection
        datasource.closeConnection();
    }
}
