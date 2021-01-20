package viikko01.ehtorakenteet;

import java.util.Scanner;

public class EdullisempiPuoleenHintaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita kahden tuotteen hinnat: ");

        double tuote1 = lukija.nextDouble();
        double tuote2 = lukija.nextDouble();
        double alennus = 0;

        if (tuote1 < tuote2) {
            alennus = 0.5 * tuote1;
        } else {
            alennus = 0.5 * tuote2;
        }

        double hinta = tuote1 + tuote2 - alennus;

        System.out.println("Hinta on yhteensä " + hinta + " euroa.");
    }
}
