package viikko07.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class KooditiedostonRivinumerot {
    private static Path polku = Paths.get("src", "viikko07", "tiedostot", "KooditiedostonRivinumerot.java");

    public static void main(String[] args) {
        List<String> rivit = lueTiedosto();
        List<String> rivitNumeroituna = lisaaRivinumerot(rivit);

        for (String r : rivitNumeroituna) {
            System.out.println(r);
        }
    }

    public static List<String> lueTiedosto() {
        try {
            List<String> rivit = Files.readAllLines(polku, StandardCharsets.UTF_8);
            return rivit;
        } catch (IOException e) {
            System.err.println("Tiedoston lukeminen epäonnistui: " + e.getMessage());
            return new ArrayList<String>();
        }
    }

    public static List<String> lisaaRivinumerot(List<String> rivit) {
        List<String> numeroidut = new ArrayList<>();
        for (int i = 0; i < rivit.size(); i++) {
            String alku = ((i + 1) + ":  ").substring(0, 4);
            numeroidut.add(alku + rivit.get(i));
        }
        return numeroidut;
    }
}
