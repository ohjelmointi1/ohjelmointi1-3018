package viikko08.kertaus;

import java.util.ArrayList;
import java.util.List;

public class Leikkaus {

    public static List<Integer> laskeLeikkaus(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> leikkaus = new ArrayList<>();

        for (int num : lista1) {
            if (lista2.contains(num) && !leikkaus.contains(num)) {
                leikkaus.add(num);
            }
        }

        return leikkaus;
    }
}
