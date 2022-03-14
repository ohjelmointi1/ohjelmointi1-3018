package viikko08.kertaus.playlist;

public class Song {

    private String title;
    private int length;

    public Song() {
    }

    public Song(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
