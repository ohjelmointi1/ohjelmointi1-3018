package viikko03.taulukot;

import java.util.Arrays;
import java.util.Scanner;

public class LottonumeroidenKysyminen {

    public static void main(String[] args) {
        int[] lottorivi = new int[7];
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä lottorivi: ");
        for (int i = 0; i < lottorivi.length; i++) {
            int lottonumero = lukija.nextInt();

            lottorivi[i] = lottonumero;
        }

        String merkkijonoEsitys = Arrays.toString(lottorivi);
        System.out.println(merkkijonoEsitys);
    }
}
