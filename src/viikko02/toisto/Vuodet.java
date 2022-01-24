package viikko02.toisto;

import java.time.LocalDate;

public class Vuodet {

    public static void main(String[] args) {
        final int vuosi = LocalDate.now().getYear(); // "vakio"

        System.out.println("Nykyinen vuosi on " + vuosi);

        // tulostetaan vuosilukuja 1000 kpl nykyisestä alkaen

        int v = vuosi; // v on "askeltaja"
        while (v < vuosi + 1_000) {
            System.out.println(v);

            v++;
        }
    }
}
