package aims.media;

public class DigitalVideoDisc extends Disc implements IPlayable {
    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, float cost, String director, int length){
        super(title, category, cost, director, length);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.id + ". DVD - "
                + this.title + " - "
                + this.category + " - "
                + this.director + " - "
                + this.length + ": "
                + this.cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    @Override
    public boolean equals(Object obj) {
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}