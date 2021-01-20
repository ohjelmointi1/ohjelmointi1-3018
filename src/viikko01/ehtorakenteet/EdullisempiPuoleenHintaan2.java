package viikko01.ehtorakenteet;

import java.util.Scanner;

public class EdullisempiPuoleenHintaan2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita kahden tuotteen hinnat: ");

        double tuote1 = lukija.nextDouble();
        double tuote2 = lukija.nextDouble();
        double halvempi = Math.min(tuote1, tuote2);

        // "Ongelma" muotoiltuna hieman toisella tavalla:
        double alennus = 0.5 * halvempi;

        double hinta = tuote1 + tuote2 - alennus;

        System.out.println("Hinta on yhteensä " + hinta + " euroa.");
    }
}
