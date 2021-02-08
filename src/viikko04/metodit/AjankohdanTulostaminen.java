package viikko04.metodit;

import java.time.LocalDate;
import java.time.LocalTime;

public class AjankohdanTulostaminen {

    public static void main(String[] args) {
        tulostaKellonaika();

        tulostaPaivamaara();
    }

    public static void tulostaKellonaika() {
        LocalTime kellonaika = LocalTime.now();
        System.out.println(kellonaika);
    }

    public static void tulostaPaivamaara() {
        LocalDate paivamaara = LocalDate.now();
        System.out.println(paivamaara);
    }
}
