package viikko01.ehtorakenteet;

import java.util.Scanner;

public class Kangaskassit {

    // https://www.is.fi/taloussanomat/art-2000006283077.html
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä ostosten kokonaismäärä: ");
        int ostokset = lukija.nextInt();

        if (ostokset >= 25_000) {
            System.out.println("Saat violettikuvioisen kassin");
        } else if (ostokset >= 10_000) {
            // Tiedetään varmasti, että ostokset olivat < 25 000
            System.out.println("Saat sinikuvioisen kassin");
        } else if (ostokset >= 6_000) {
            // Tiedetään varmasti, että ostokset olivat < 10 000
            System.out.println("Saat vihreäkuvioisen kassin");
        } else if (ostokset >= 3_000) {
            System.out.println("Saat mustakuvioisen kassin");
        } else {
            System.out.println("Saat keltaisen muovikassin");
        }
    }
}
