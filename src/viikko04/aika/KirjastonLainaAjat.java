package viikko04.aika;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KirjastonLainaAjat {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();

        LocalDate cdPalautusPaiva = tanaan.plusDays(14);
        LocalDate kirjanPalautusPaiva = tanaan.plusDays(28);

        tulostaLainaAika("Kirja", tanaan, kirjanPalautusPaiva);
        tulostaLainaAika("CD", tanaan, cdPalautusPaiva);
    }

    private static void tulostaLainaAika(String nimi, LocalDate alku, LocalDate loppu) {
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("d.M.yyyy");

        System.out.println(nimi + ", laina-aika: " + alku.format(muotoilu) + " - " + loppu.format(muotoilu));
    }
}
