package viikko08.kertaus.playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public Song getSong(int index) {
        if (index >= this.songs.size()) {
            return null;
        }
        return this.songs.get(index);
    }

    public int getTotalLength() {
        int total = 0;

        for (Song s : this.songs) {
            total += s.getLength();
        }

        return total;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < this.songs.size(); i++) {
            str += (i + 1) + ": " + this.songs.get(i).toString() + "\n";
        }

        return str;
    }
}
