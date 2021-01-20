package viikko01.perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumeroidenLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat muotoilija = new DecimalFormat("0.00");

        System.out.print("Kirjoita kolme numeroa: ");
        double eka = lukija.nextDouble();
        double toka = lukija.nextDouble();
        double kolmas = lukija.nextDouble();

        double summa = eka + toka + kolmas;
        String summaMuotoiltuna = muotoilija.format(summa);

        System.out.println("Summa: " + summaMuotoiltuna);

        double keskiarvo = summa / 3;

        // muotoiltua lukua ei ole pakko asettaa välissä muuttujaan:
        System.out.println("Keskiarvo: " + muotoilija.format(keskiarvo));
    }
}
