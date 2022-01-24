package viikko01.ehtorakenteet;

import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Valitse tarkastuksen tyyppi: ");
        System.out.println("0: katsastus");
        System.out.println("1: jälkitarkastus");

        int katsastusTyyppi = lukija.nextInt();

        if (katsastusTyyppi == 1) {
            System.out.println("Hinta on 30 euroa");

        } else if (katsastusTyyppi == 0) {
            System.out.println("Mitataanko päästöt? ");
            System.out.println("0: ei ");
            System.out.println("1: kyllä ");

            int päästöt = lukija.nextInt();

            if (päästöt == 0) {
                System.out.println("Hinta on 50 euroa");

            } else if (päästöt == 1) {
                System.out.println("Valitse polttoaineen tyyppi:");
                System.out.println("0: bensa ");
                System.out.println("1: diesel ");

                int polttoaine = lukija.nextInt();

                if (polttoaine == 0) {
                    System.out.println("Hinta on 72 euroa");

                } else if (polttoaine == 1) {
                    System.out.println("Hinta on 81 euroa");

                }
            }
        }
    }
}
