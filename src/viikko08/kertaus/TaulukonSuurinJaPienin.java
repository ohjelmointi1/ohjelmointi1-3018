package viikko08.kertaus;

import java.util.Arrays;

public class TaulukonSuurinJaPienin {

    public static void main(String[] args) {
        int[] lampotilat = { 10, 12, 435, 1234, 6, 12, 654, 12, 4355, 234 };

        int minimi = lampotilat[0];
        int maksimi = lampotilat[0];
        int summa = 0;

        for (int lampo : lampotilat) {
            if (lampo > maksimi) {
                maksimi = lampo;
            }
            if (lampo < minimi) {
                minimi = lampo;
            }
            summa += lampo;
        }

        System.out.println(Arrays.toString(lampotilat));
        System.out.println("Pienin: " + minimi);
        System.out.println("Suurin: " + maksimi);
        System.out.println("Summa: " + summa);
        System.out.println("Keskiarvo: " + (1.0 * summa / lampotilat.length));
    }
}
