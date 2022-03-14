package viikko08.kertaus.playlist;

public class PlaylistTest {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Song song = new Song();
        song.setTitle("Never Gonna Give You Up");
        song.setLength(215);

        playlist.addSong(song);

        Song song2 = new Song();
        song2.setTitle("Hooked on a Feeling");
        song2.setLength(211);

        playlist.addSong(song2);

        System.out.println(playlist);

        System.out.println("Length: " + playlist.getTotalLength());

//        System.out.println(playlist.getTotalLength());
//
//        System.out.println(playlist.getTotalLength());

    }
}
