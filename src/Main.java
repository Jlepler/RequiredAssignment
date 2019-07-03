import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            System.out.println("Enter an artist to search");
            String artist = key.nextLine();                                                         //modify program to prompt user for an artist
            System.out.println("Enter a title to search ");
            String title = key.nextLine();                                                       //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song s: songs){
            System.out.println(s.toString());
        }

        //look for blue and print if found
        String titleToFind = "blue";
        for (Song s: songs){
            if (s.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",s.toString());
            }
        }
    }
}