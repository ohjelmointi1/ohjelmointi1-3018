package viikko01.perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AjanLaskeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä aika sekunteina: ");
        int aikaleima = lukija.nextInt(); // ilmaistu sekunteina

        System.out.println(); // tyhjä rivi

        int tunnit = aikaleima / 3600; // 3600 sekuntia on tunti
        int minuutit = (aikaleima / 60) % 60; // 60 sekuntia on yksi minuutti
        int sekunnit = aikaleima % 60;

        System.out.println("Tunnit: " + tunnit);
        System.out.println("Minuutit: " + minuutit);
        System.out.println("Sekunnit: " + sekunnit);

        System.out.println(); // tyhjä rivi

        DecimalFormat kaksiNumeroa = new DecimalFormat("00");

        String muotoiltuMinuutit = kaksiNumeroa.format(minuutit);
        String muotoiltuSekunnit = kaksiNumeroa.format(sekunnit);

        System.out.println(tunnit + ":" + muotoiltuMinuutit + ":" + muotoiltuSekunnit);

        lukija.close(); // valinnainen, poistaa virheen "is never closed"
    }
}
