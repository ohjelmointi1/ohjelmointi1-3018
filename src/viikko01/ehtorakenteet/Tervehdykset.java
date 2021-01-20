package viikko01.ehtorakenteet;

import java.time.LocalTime; // muista poistaa tämä rivi Viopessa!

public class Tervehdykset {

    public static void main(String[] args) {
        LocalTime nykyhetki = LocalTime.now();

        int tunnit = nykyhetki.getHour();

        System.out.println(tunnit);

        if (tunnit >= 9 && tunnit < 12) {
            System.out.println("Koodataan!");
        }
    }
}
