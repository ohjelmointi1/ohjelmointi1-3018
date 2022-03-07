package viikko07.tiedostot.citybikes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Tämä tuntiesimerkki hyödyntää "Helsingin ja Espoon kaupunkipyörillä ajetut
 * matkat" -tietoaineistoa, joka on saatavissa osoitteesta:
 * https://www.avoindata.fi/data/fi/dataset/helsingin-ja-espoon-kaupunkipyorilla-ajatut-matkat
 * 
 * Koodin kokeilemiseksi tallenna itsellesi heinäkuun 2020 aineisto osoitteesta
 * https://dev.hsl.fi/citybikes/od-trips-2021/2021-07.csv, ja siirrä se
 * Java-projektin juurihakemistoon nimellä kaupunkipyorat-2021-07.csv.
 * 
 * Datan omistaa City Bike Finland ja sen lisenssi on CC-BY-4.0
 */
public class CityBikeFile {

    public static void main(String[] args) {
        Path csvFile = Paths.get("kaupunkipyorat-2021-07.csv");

        try {
            List<String> lines = Files.readAllLines(csvFile);
            String headers = lines.get(0);
            List<String> trips = lines.subList(1, lines.size());

            System.out.println("First line: " + headers);
            System.out.println("Total number of lines: " + lines.size());

            long totalDistance = 0L;
            for (String trip : trips) {
                // String sanitized = sanitize(trip);
                int distance = getDistance(trip);

                totalDistance += distance;
            }

            System.out.println("Total distance: " + totalDistance / 1000.0 + " km");
            System.out.println(totalDistance / 1_000.0 / 40_075 + " times around the world");

        } catch (IOException fileException) {
            System.out.println("Failed to read the file! " + fileException.getMessage());
        }
    }

    private static String sanitize(String line) {
        line = line.replace("\"Aalto-yliopisto (M), Korkeakouluaukio\"", "Aalto-yliopisto (M) Korkeakouluaukio");
        line = line.replace("\"Aalto-yliopisto (M), Tietotie\"", "Aalto-yliopisto (M) Tietotie");
        return line;
    }

    /**
     * "2021-07-01T00:00:04,2021-07-01T00:04:32,028,Lastenlehto,030,Itämerentori,790,264"
     * 
     * Ottaa parametrinaan yksittäisen matkan rivin, ja parsii siitä matkan, joka
     * palautetaan kokonaislukuna.
     * 
     * @return 790
     */
    private static int getDistance(String line) {
        String[] parts = line.split(",");

        // distance is the second last "column"
        String distance = parts[parts.length - 2];

        if (distance.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(distance);
        }
    }
}
