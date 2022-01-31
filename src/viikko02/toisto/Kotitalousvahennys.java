package viikko02.toisto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

        double omavastuu = 100;
        double maksimikorvaus = 2_400;

        // "Summamuuttuja"
        double kulut = 0.00;

        while (true) {
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            double kulu = lukija.nextDouble();

            if (kulu <= 0) {
                break;
            } else {
                kulut += kulu;
            }
        }

        double korvaus = kulut * 0.5 - omavastuu;

        if (korvaus > maksimikorvaus) {
            korvaus = maksimikorvaus;
        } else if (korvaus < 0) {
            korvaus = 0;
        }

        String muotoiltu = kaksiDesimaalia.format(korvaus);
        System.out.println("Kotitalousvähennyksen määrä on " + muotoiltu + " euroa");
    }
}
