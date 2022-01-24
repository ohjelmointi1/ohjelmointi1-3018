package viikko02.toisto;

import java.time.LocalDate;

public class VuodenKeskipituus {

    public static void main(String[] args) {
        int vuosi = LocalDate.now().getYear();
        int vuosienMaara = 100_000;

        // Lasketaan vaikka keskimääräinen pituus 100 000 vuodelle!
        long pituusYhteensa = 0; // "summamuuttuja"

        for (int v = vuosi; v < vuosi + vuosienMaara; v++) {

            if (v % 4 == 0 && (v % 100 != 0 || v % 400 == 0)) {
                pituusYhteensa += 366;
            } else {
                pituusYhteensa += 365;
            }
        }

        System.out.println("Päiviä oli yhteensä " + pituusYhteensa);
        System.out.println("Vuoden pituus on keskimäärin " + (1.0 * pituusYhteensa) / vuosienMaara);
    }
}
