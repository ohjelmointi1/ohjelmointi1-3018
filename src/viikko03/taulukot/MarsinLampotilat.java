package viikko03.taulukot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarsinLampotilat {

    public static void main(String[] args) {
        Integer[] lampotilat = { 10, -50, 40, 9, -12, 5, -90, 0, 5, 12 };

        // "Life hack": muutetaan taulukko listaksi, jolloin voidaan käyttää
        // Collections.max ja min metodeja.
        List<Integer> lampotilaLista = Arrays.asList(lampotilat);
        int pienin = Collections.min(lampotilaLista);
        int suurin = Collections.max(lampotilaLista);

        System.out.println("Pienin mittaustulos: " + pienin);
        System.out.println("Suurin mittaustulos: " + suurin);
    }
}
