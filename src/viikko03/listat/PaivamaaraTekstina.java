package viikko03.listat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaivamaaraTekstina {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();

        // Esimerkki, miten luodaan tyhjä lista, ja miten siihen lisätään arvoja:
        List<String> paivat = new ArrayList<>();
        paivat.add("Maanantai");
        paivat.add("Tiistai");
        paivat.add("Keskiviikko");
        paivat.add("Torstai");
        paivat.add("Perjantai");
        paivat.add("Lauantai");
        paivat.add("Sunnuntai");

        // Esimerkki listan luomisesta valmiilla arvoilla (tällä tapaa lista on
        // muuttumaton)
        List<String> kuukaudet = List.of("tammi", "helmi", "maalis", "huhti", "touko", "kesä", "heinä", "elo", "syys",
                "loka", "marras", "joulu");

        int viikonPaiva = tanaan.getDayOfWeek().getValue();
        int kuukaudenPaiva = tanaan.getDayOfMonth();

        String paivaNimi = paivat.get(viikonPaiva - 1);
        String kuukausiNimi = kuukaudet.get(tanaan.getMonthValue() - 1) + "kuuta";

        System.out.println(
                "Tänään on " + paivaNimi + " " + kuukaudenPaiva + ". " + kuukausiNimi + " " + tanaan.getYear() + ".");
    }
}
