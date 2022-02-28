package viikko06.juhlapyhat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JarjestyksenVertailu {

    public static void main(String[] args) {
        System.out.println("Joulu".compareTo("Vappu"));

        System.out.println("Laskiainen".compareTo("Joulu"));

        System.out.println(LocalDate.now().compareTo(LocalDate.of(2022, 12, 24)));

        List<String> nimet = new ArrayList<>();
        nimet.add("Laskiainen");
        nimet.add("kalevalan päivä");
        nimet.add("Vappu");
        nimet.add("Juhannus");
        nimet.add("jouluaatto");

        Collections.sort(nimet, String::compareToIgnoreCase);

        System.out.println(nimet);
    }
}
