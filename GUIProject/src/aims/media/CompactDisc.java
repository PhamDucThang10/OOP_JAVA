package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements IPlayable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(String title, String category, float cost, String director, int length, String artist) {
        super(title, category, cost, director, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track a) {
        if (!tracks.contains(a)) {
            tracks.add(a);
        }
    }

    public void removeTrack(Track a) {
        tracks.remove(a);
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Artist: " + this.artist);
        System.out.println("List of track");
        for (Track a : tracks) {
            a.play();
        }
    }

    public String toString() {
        StringBuilder t = new StringBuilder();
        for (Track track : tracks) {
            t.append(track).append(" ");
        }
        return this.artist + " " + t;
    }
}