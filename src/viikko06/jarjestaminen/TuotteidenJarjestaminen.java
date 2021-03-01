package viikko06.jarjestaminen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import viikko06.vertailu.Tuote;

public class TuotteidenJarjestaminen {

    public static void main(String[] args) {
        List<Tuote> tuotteet = new ArrayList<>();
        tuotteet.add(new Tuote("Muumimuki", 1_500.00));
        tuotteet.add(new Tuote("Soda stream -laite", 10.50));
        tuotteet.add(new Tuote("Aku Ankka numero 1", 10_000.0));
        tuotteet.add(new Tuote("Kurahaalarit", 20.00));

        System.out.println("Alkuperäinen: " + tuotteet);

        Collections.sort(tuotteet, Comparator.comparing(Tuote::getNimi));

        System.out.println("Järjestetty nimen mukaan: " + tuotteet);

        Collections.sort(tuotteet, Comparator.comparing(Tuote::getHinta));

        System.out.println("Järjestetty hinnan mukaan (kasvava): " + tuotteet);

        Collections.reverse(tuotteet);

        System.out.println("Järjestetty hinnan mukaan (laskeva): " + tuotteet);
    }
}
