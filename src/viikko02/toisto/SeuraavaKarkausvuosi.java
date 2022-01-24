package viikko02.toisto;

import java.time.LocalDate;

public class SeuraavaKarkausvuosi {

    public static void main(String[] args) {
        final int vuosi = LocalDate.now().getYear(); // "vakio"

        System.out.println("Nykyinen vuosi on " + vuosi);

        int v = vuosi + 1; // v on "askeltaja"

        // Selvitetään seuraava karkausvuosi
        while (true) {
            if (v % 4 == 0 && (v % 100 != 0 || v % 400 == 0)) {
                break;
            }
            v++;
        }

        System.out.println("Seuraava karkausvuosi on " + v);
    }
}
