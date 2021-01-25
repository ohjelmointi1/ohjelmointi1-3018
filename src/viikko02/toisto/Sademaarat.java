package viikko02.toisto;

import java.util.Scanner;

public class Sademaarat {

    public static void main(String[] args) {
        int lukumaara = 0;
        int summa = 0;
        int maksimi = 0;
        int minimi = Integer.MAX_VALUE;

        System.out.println("Syötä päivittäiset sademäärät millimetreinä.");
        System.out.println("Negatiivinen luku pysäyttää toiston.");
        System.out.println(); // tyhjä rivi

        Scanner lukija = new Scanner(System.in);

        // kysytään sademääriä
        while (true) {
            System.out.print("Syötä seuraava sademäärä: ");
            int sademaara = lukija.nextInt();

            if (sademaara < 0) {
                break;
            }

            if (sademaara > maksimi) {
                maksimi = sademaara;
            }

            if (sademaara < minimi) {
                minimi = sademaara;
            }

            summa += sademaara;
            lukumaara++;
        }

        System.out.println(); // tyhjä rivi

        // tulostetaan summa, määrä ja keskiarvo
        System.out.println("Summa: " + summa);
        System.out.println("Lukumäärä: " + lukumaara);
        System.out.println("Keskiarvo: " + (1.0 * summa / lukumaara));
        System.out.println("Maksimi: " + maksimi);
        System.out.println("Minimi: " + minimi);
    }
}
