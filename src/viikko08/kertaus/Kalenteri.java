package viikko08.kertaus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Kalenteri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä vuosi: ");
        int vuosi = lukija.nextInt();

        System.out.print("Syötä kuukausi: ");
        int kuukausi = lukija.nextInt();

        YearMonth kuukausiOlio = YearMonth.of(vuosi, kuukausi);

        System.out.println();

        tulostaKalenteri(kuukausiOlio);
    }

    private static void tulostaKalenteri(YearMonth kuukausi) {
        System.out.println("Ma Ti Ke To Pe La Su");

        LocalDate vikaPaiva = kuukausi.atEndOfMonth();
        LocalDate paiva = kuukausi.atDay(1);

        // tulostetaan tyhjiä merkkejä, jos kk alkaa muusta kuin maanantaista
        for (int i = 1; i < paiva.getDayOfWeek().getValue(); i++) {
            System.out.print("   ");
        }

        while (!paiva.isAfter(vikaPaiva)) {
            // tulostetaan kaikki päivät "samanlevyisinä"
            System.out.print(muotoileKolmellaMerkilla(paiva.getDayOfMonth()));

            // tulostetaan saman viikon päivät samalle riville
            if (paiva.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
            paiva = paiva.plusDays(1);
        }
    }

    private static String muotoileKolmellaMerkilla(int luku) {
        if (luku < 10) {
            return luku + "  ";
        } else {
            return luku + " ";
        }
    }
}
