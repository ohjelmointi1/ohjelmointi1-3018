package viikko08.kertaus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuuretKaupungit {

    public static void main(String[] args) {
        Path tiedostonPolku = Paths.get("kaupungit.csv");

        try {
            List<String> rivit = Files.readAllLines(tiedostonPolku);

            List<String> suuret = new ArrayList<>();

            for (String rivi : rivit.subList(1, rivit.size())) {
                String[] osat = rivi.split(",");
                String nimi = osat[0];
                int vakiluku = Integer.parseInt(osat[1]);

                if (vakiluku >= 10_000) {
                    suuret.add(nimi);
                }
            }

            Collections.sort(suuret);

            for (String nimi : suuret) {
                System.out.println(nimi);
            }
        } catch (IOException ioPoikkeus) {
            ioPoikkeus.printStackTrace();
        }
    }
}
