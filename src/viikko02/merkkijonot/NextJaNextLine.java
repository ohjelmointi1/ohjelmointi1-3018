package viikko02.merkkijonot;

import java.util.Scanner;

public class NextJaNextLine {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä kolme lempiruokaasi:");
        String eka = lukija.next();
        String toka = lukija.next();
        String kolmas = lukija.next();

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(kolmas);
    }
}
