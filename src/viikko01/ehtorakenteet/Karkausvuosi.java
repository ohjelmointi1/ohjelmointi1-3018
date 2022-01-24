package viikko01.ehtorakenteet;

import java.time.LocalDate;

public class Karkausvuosi {

    public static void main(String[] args) {
        LocalDate nykyhetki = LocalDate.now();
        int vuosi = nykyhetki.getYear();

        // jaollinen neljällä, ja joko jaollinen 400:lla tai ei jaollinen 100:lla
        if (vuosi % 4 == 0 && (vuosi % 100 != 0 || vuosi % 400 == 0)) {
            System.out.println(vuosi + " on karkausvuosi.");
        } else {
            System.out.println(vuosi + " ei ole karkausvuosi.");
        }
    }
}
