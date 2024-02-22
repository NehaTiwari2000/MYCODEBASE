package javautil;

import commonMethod.MyCommonMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(100);
        integerList.add(2);

        MyCommonMethod.extracted(integerList);
        System.out.println("-----------");
        Collections.sort(integerList);
        MyCommonMethod.extracted(integerList);


        List<String> names = List.of("Neha", "Sakshi", "Sanju", "Kamlesh");
        MyCommonMethod.extracted(names);


        System.out.println("-------------------------------------------------------------------");

        List<Song> songList = new ArrayList<>();

        songList.add(new Song("Restart", "Shaan", 2022));
        songList.add(new Song("Bolo Na", "Shreya", 2022));
        songList.add(new Song("Ashiquee", "Kumar Sanu", 2000));
        songList.add(new Song("neha","AAA",2098));
        songList.add(new Song("neha","AAA",1991));

        MyCommonMethod.extracted(songList);
//        Collections.sort(songList);
//        System.out.println("------------------------------after sorting ------------------------------");
//        MyCommonMethod.extracted(songList);


        Comparator<Song> comparator = new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getArtist().compareTo(o2.getArtist());
            }
        };
        System.out.println("--------------------------------sorting by comparator---------------------------");
        Collections.sort(songList,comparator);
        MyCommonMethod.extracted(songList);



    }


}

class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private Integer year;

    public Song(String title, String artist, Integer year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Song o) {
//        desc order
//        return o.getArtist().compareTo(this.getArtist());
//        asc order
//        return this.getArtist().compareTo(o.getArtist());
       return  this.getTitle().compareTo(o.getTitle());
    }
}
