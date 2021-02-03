package viikko03.taulukot;

import java.util.Scanner;

public class Lottotarkistin {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        int[] oikeaRivi = new int[7];

        System.out.print("Syötä oikea lottorivi: ");
        for (int i = 0; i < oikeaRivi.length; i++) {
            oikeaRivi[i] = lukija.nextInt();
        }
        // tässä vaiheessa scannerissa on odottamassa tyhjä rivinvaihto,
        // katso https://stackoverflow.com/a/13102066 seuraavan rivin selitykseksi
        lukija.nextLine();

        System.out.println();

        while (true) {
            System.out.print("Syötä tarkistettava lottorivi (tyhjä lopettaa): ");
            String rivi = lukija.nextLine();
            if (rivi.isEmpty()) {
                break;
            }
            String[] omatNumerot = rivi.split(" ");
            int oikeat = 0;

            for (int i = 0; i < omatNumerot.length; i++) {
                int omaNumero = Integer.parseInt(omatNumerot[i]);

                // "advanced for lopp" tai "for each loop":
                for (int oikeaNumero : oikeaRivi) {
                    if (oikeaNumero == omaNumero) {
                        oikeat++;
                    }
                }
            }
            System.out.println(oikeat + " oikein!");
            System.out.println();
        }

        System.out.println("Loppu");
    }

}
