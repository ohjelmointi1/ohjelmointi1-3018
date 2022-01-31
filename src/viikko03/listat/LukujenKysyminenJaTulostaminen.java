package viikko03.listat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKysyminenJaTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> numerot = new ArrayList<>();

        while (true) {
            System.out.print("Syötä seuraava numero, negatiivinen lopettaa: ");
            int numero = lukija.nextInt();

            if (numero >= 0) {
                numerot.add(numero);
            } else {
                break;
            }
        }

        System.out.println(); // tyhjä rivi

        for (int i = 0; i < numerot.size(); i++) {
            System.out.println(i + ": " + numerot.get(i));
        }
    }
}
