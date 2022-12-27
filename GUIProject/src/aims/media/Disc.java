package aims.media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc() {
        super();
    }

    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public String toString() {
        return null;
    }
}