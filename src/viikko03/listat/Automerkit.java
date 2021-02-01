package viikko03.listat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Automerkit {

    public static void main(String[] args) {

        System.out.println("Syötä automerkit: (tyhjä rivi lopettaa)");

        /*
         * Esim. TOYOTA\nVOLKSWAGEN\nVOLVO\nFORD
         */
        Scanner lukija = new Scanner(System.in);

        List<String> automerkit = new ArrayList<>();

        while (true) {
            String automerkki = lukija.nextLine();
            if (automerkki.isEmpty()) {
                break;
            }

            if (!automerkit.contains(automerkki)) {
                automerkit.add(automerkki);
            }
        }

        Collections.sort(automerkit);

        System.out.println("<select>");

        // "advanced for loop"
        for (String nimi : automerkit) {
            String ekaKirjain = nimi.substring(0, 1).toUpperCase();
            String loppuosa = nimi.substring(1).toLowerCase();

            System.out.println("    <option>" + ekaKirjain + loppuosa + "</option>");
        }

        System.out.println("</select>");
    }
}
