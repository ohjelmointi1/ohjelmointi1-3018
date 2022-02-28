package viikko06.juhlapyhat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaivienJarjestaminen {

    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();
        nimet.add("Laskiainen");
        nimet.add("Kalevalan päivä");
        nimet.add("Vappu");
        nimet.add("Juhannus");
        nimet.add("Jouluaatto");

        Collections.sort(nimet);

        System.out.println(nimet);

        List<LocalDate> paivat = new ArrayList<>();
        paivat.add(LocalDate.of(2022, 3, 1));
        paivat.add(LocalDate.of(2022, 12, 24));
        paivat.add(LocalDate.of(2022, 2, 28));

        Collections.sort(paivat);

        System.out.println(paivat);

        LocalDate laskiainen = LocalDate.of(2022, 3, 1);
        LocalDate joulu = LocalDate.of(2022, 12, 24);

        System.out.println(laskiainen.compareTo(joulu));
        System.out.println(joulu.compareTo(joulu));
    }
}
