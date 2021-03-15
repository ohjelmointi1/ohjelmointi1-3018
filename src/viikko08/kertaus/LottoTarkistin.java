package viikko08.kertaus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoTarkistin {

    public static void main(String[] args) {
        System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
        List<Integer> oikeatNumerot = kysyNumerot(8);
        int lisanumero = oikeatNumerot.remove(oikeatNumerot.size() - 1);

        while (true) {
            System.out.print("Anna tarkastettava rivi (7 numeroa): ");
            List<Integer> kuponginNumerot = kysyNumerot(7);

            List<Integer> oikeat = Leikkaus.laskeLeikkaus(kuponginNumerot, oikeatNumerot);
            int oikeinKpl = oikeat.size();
            boolean lisanumeroOikein = kuponginNumerot.contains(lisanumero);

            if (lisanumeroOikein) {
                System.out.println(oikeinKpl + " oikein ja lisänumero.");
            } else {
                System.out.println(oikeinKpl + " oikein.");
            }
            System.out.println();
        }
    }

    private static List<Integer> kysyNumerot(int lukumaara) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> numerot = new ArrayList<>();

        for (int i = 0; i < lukumaara; i++) {
            numerot.add(lukija.nextInt());
        }

        return numerot;
    }
}
