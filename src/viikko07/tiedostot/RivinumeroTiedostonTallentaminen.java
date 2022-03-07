package viikko07.tiedostot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RivinumeroTiedostonTallentaminen {

    public static void main(String[] args) {
        List<String> rivit = KooditiedostonRivinumerot.lueTiedosto();
        List<String> numeroidut = KooditiedostonRivinumerot.lisaaRivinumerot(rivit);

        try {
            Path polku = Paths.get("rivinumeroitu.txt");
            Files.write(polku, numeroidut);
            System.out.println("Tiedosto " + polku.toAbsolutePath() + " kirjoitettiin onnistuneesti!");

        } catch (IOException e) {
            System.err.println("Tiedoston kirjoittaminen epäonnistui: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
