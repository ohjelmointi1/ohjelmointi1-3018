package viikko08.kertaus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Liukuluvut {

    /**
     * Tämä esimerkki toimii sekä syötteen pilkkujen että pisteiden kanssa.
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita jokin desimaaliluku: ");
        String syote = lukija.nextLine();

        // Toimii sekä pilkulla että pisteellä!!!
        double luku = Double.parseDouble(syote.replace(",", "."));

        System.out.println("Liukulukuna: " + luku);

        DecimalFormat muotoilu = new DecimalFormat("0.00");

        System.out.println("Muotoiltu: " + muotoilu.format(luku));
    }
}
