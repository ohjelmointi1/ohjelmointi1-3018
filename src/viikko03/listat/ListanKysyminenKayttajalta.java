package viikko03.listat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanKysyminenKayttajalta {

    public static void main(String[] args) {
        System.out.println("Syötä tuloslista. Tyhjä tai yhdysviiva (-) lopettaa:");

        Scanner lukija = new Scanner(System.in);
        List<String> tulokset = new ArrayList<>();

        while (true) {

            String syote = lukija.nextLine();

            if (syote.isEmpty() || syote.equals("-")) {
                break;
            } else {
                // lisää listalle
                tulokset.add(syote);
            }
        }

        for (int i = 0; i < tulokset.size(); i++) {
            String nimi = tulokset.get(i);

            System.out.println((i + 1) + ": " + nimi);
        }

        lukija.close();
    }
}
