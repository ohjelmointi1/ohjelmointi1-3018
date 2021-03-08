package viikko07.tiedostot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class KalenterinLukija {

    private String tiedostonNimi;

    public KalenterinLukija(String tiedosto) {
        this.tiedostonNimi = tiedosto;
    }

    public List<Tapahtuma> lueTapahtumat() {
        List<Tapahtuma> tapahtumat = new ArrayList<>();

        try {
            Path polku = Paths.get(tiedostonNimi);
            List<String> rivit = Files.readAllLines(polku);

            for (int i = 1; i < rivit.size(); i++) {
                String rivi = rivit.get(i);
                tapahtumat.add(Tapahtuma.parse(rivi));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tapahtumat;
    }
}
