package viikko02.merkkijonot;

import java.util.Random;

public class SatunnainenSalasana {

    public static void main(String[] args) {
        Random satunnaisgeneraattori = new Random();

        String erikoismerkit = "!\"#¤%&/()=?";
        String numerot = "23456789";
        String pienet = "abcdefghjkmnpqrstuvwxyz";
        String isot = pienet.toUpperCase();

        String kaikki = pienet + isot + numerot + erikoismerkit;

        String salasana = "";

        for (int i = 0; i < 64; i++) {
            int satunnainen = satunnaisgeneraattori.nextInt(kaikki.length());

            String merkki = kaikki.substring(satunnainen, satunnainen + 1);
            salasana += merkki;
        }

        System.out.println(salasana);
    }
}
