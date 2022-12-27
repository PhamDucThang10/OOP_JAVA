package aims;

import aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Media> mediae = new ArrayList<Media>();
        Media cd = new CompactDisc();
        Media dvd = new DigitalVideoDisc();
        Media book = new Book();
        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd);
        for(Media m:mediae){
            System.out.println(m.toString());
        }
    }
}