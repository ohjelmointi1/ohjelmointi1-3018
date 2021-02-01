package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class NumerotListoilla {

    public static void main(String[] args) {

        int hypynPisteet = 266;
        int hypynPisteet2 = 264;

        List<Integer> pisteet = new ArrayList<>();

        // taustalla Java muuttaa int-arvot Integer-olioiksi:
        pisteet.add(hypynPisteet);
        pisteet.add(hypynPisteet2);

        System.out.println(pisteet);
    }
}
