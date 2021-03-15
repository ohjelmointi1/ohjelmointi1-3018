package viikko08.kertaus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoKuponki {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kuinka monta lottoriviä haluat generoida? ");

        int rivit = lukija.nextInt();

        for (int i = 0; i < rivit; i++) {
            List<Integer> lottorivi = generoiLottorivi();
            String riviStr = muotoileLottorivi(lottorivi);
            System.out.println(riviStr);
        }
    }

    private static List<Integer> generoiLottorivi() {
        Random satunnainen = new Random();
        List<Integer> numerot = new ArrayList<>();

        while (numerot.size() < 7) {
            int luku = satunnainen.nextInt(40) + 1; // 1 - 40

            if (!numerot.contains(luku)) {
                numerot.add(luku);
            }
        }
        return numerot;
    }

    private static String muotoileLottorivi(List<Integer> rivi) {
        Collections.sort(rivi);
        String tulos = "";
        for (int numero : rivi) {
            tulos += numero + ", ";
        }
        return tulos.substring(0, tulos.length() - 2);
    }
}
