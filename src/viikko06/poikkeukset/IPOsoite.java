package viikko06.poikkeukset;

import java.util.Scanner;

public class IPOsoite {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä ip: ");
        String syote = lukija.nextLine();
        boolean ok = validoiIPOsoite(syote);

        if (ok) {
            System.out.println("IP-osoite on validi.");

            if (onYksityinen(syote)) {
                System.out.println("Osoite on yksityinen.");
            } else {
                System.out.println("Osoite on julkinen.");
            }
        } else {
            System.out.println("IP-osoite on virheellinen.");
        }
    }

    /**
     * Huom! Tämä metodi toimii vain, jos annettu ip on jo todettu validiksi.
     */
    private static boolean onYksityinen(String ip) {
        int[] osat = pilkoOsoite(ip);

        // "loopback"
        if (ip.equals("127.0.0.1")) {
            return true;
        }

        // Class A: 10.0.0.0 — 10.255.255.255
        if (osat[0] == 10) {
            return true;
        }

        // Class B: 172.16.0.0 — 172.31.255.255
        if (osat[0] == 172 && osat[1] >= 16 && osat[1] <= 31) {
            return true;
        }

        // Class C: 192.168.0.0 — 192.168.255.255
        if (osat[0] == 192 && osat[1] == 168) {
            return true;
        }

        return false;
    }

    /**
     * Huom! Tämä pilkkoo vain valideja ip-osoitteita.
     */
    private static int[] pilkoOsoite(String ip) {
        String[] osat = ip.split("\\.");
        int[] numerot = new int[osat.length];

        for (int i = 0; i < osat.length; i++) {
            numerot[i] = Integer.parseInt(osat[i]);
        }
        return numerot;
    }

    private static boolean validoiIPOsoite(String ip) {
        String[] osat = ip.split("\\.");

        if (osat.length != 4) {
            System.err.println("Virheellinen pituus");
            return false;
        }

        try {
            for (int i = 0; i < 4; i++) {
                String osa = osat[i];

                int numero = Integer.parseInt(osa); // mahdollinen NumberFormat...

                if (numero < 0 || numero > 255) {
                    return false;
                }
            }

        } catch (NumberFormatException numeroPoikkeus) {
            System.err.println("Virheellinen numero (" + numeroPoikkeus.getMessage() + ")");
            return false;
        }

        return true;
    }
}
