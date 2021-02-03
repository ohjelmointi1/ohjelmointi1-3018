package viikko03.taulukot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Tässä tuntiesimerkissä käsitellään Ilmatieteen laitoksen säädataa, jonka voit
 * tallentaa CSV-muodossa osoitteesta
 * https://www.ilmatieteenlaitos.fi/havaintojen-lataus. Kopioi koko
 * CSV-tiedoston sisältö komentiriville, kun ohjelma pyytää syöttämään säädatan.
 */
public class LampotilaTilasto {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä Ilmatieteen laitoksen säädata:");

        String otsikkoRivi = lukija.nextLine();
        List<String> otsikot = Arrays.asList(otsikkoRivi.split(","));

        int maksimiIndeksi = otsikot.indexOf("Ylin lämpötila (degC)");
        int minimiIndeksi = otsikot.indexOf("Alin lämpötila (degC)");

        double minimi = Double.MAX_VALUE;
        double maksimi = Double.MIN_VALUE;

        String maksimiPvm = "";
        String minimiPvm = "";

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.isEmpty()) {
                break;
            }
            String[] tiedot = rivi.split(",");

            double paivanMaksimi = Double.parseDouble(tiedot[maksimiIndeksi]);
            double paivanMinimi = Double.parseDouble(tiedot[minimiIndeksi]);
            String nykyinenPvm = tiedot[2] + "." + tiedot[1] + "." + tiedot[0];

            if (paivanMaksimi > maksimi) {
                maksimi = paivanMaksimi;
                maksimiPvm = nykyinenPvm;
            }
            if (paivanMinimi < minimi) {
                minimi = paivanMinimi;
                minimiPvm = nykyinenPvm;
            }
        }

        System.out.println("Lämpötilan maksimi: " + maksimi + " (" + maksimiPvm + ")");
        System.out.println("Lämpötilan minimi: " + minimi + " (" + minimiPvm + ")");

    }
}
