package viikko05;

public class Song {

    private Artist artist;
    private String title;

    public Song() {
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        if (this.getArtist() == null) {
            return this.title;
        } else {
            String artistName = this.artist.getName();
            return this.title + " " + artistName;
        }
    }
}
