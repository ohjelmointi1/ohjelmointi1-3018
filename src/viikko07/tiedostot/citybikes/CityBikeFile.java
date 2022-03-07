package viikko07.tiedostot.citybikes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);

        System.out.print("Which citybike file you wish to read: ");
        String filename = input.nextLine();

        Path csvFile = Paths.get(filename);

        try {
            List<String> lines = Files.readAllLines(csvFile);
            List<String> trips = lines.subList(1, lines.size());

            System.out.println("Total number of trips: " + trips.size());

            int longestTrip = 0;
            String longestLine = "";

            long totalDistance = 0L;
            for (String trip : trips) {
                int distance = getDistance(trip);
                totalDistance += distance;

                if (distance > longestTrip) {
                    longestTrip = distance;
                    longestLine = trip;
                }
            }

            System.out.println("Total distance: " + totalDistance / 1000.0 + " km");
            System.out.println(totalDistance / 1_000.0 / 40_075 + " times around the world");
            System.out.println("Longest individual trip: " + longestTrip / 1_000.0 + " km");
            System.out.println(" - " + longestLine);

        } catch (IOException fileException) {
            System.out.println("Failed to read the file! " + fileException.getMessage());
        }
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
