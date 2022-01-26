package viikko02.merkkijonot;

import java.util.Scanner;

public class PinKoodinKysely {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        final String oikeaKoodi = "9175";
        boolean koodiOikein = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Syötä pin-koodi: ");
            String annettuKoodi = lukija.nextLine();

            if (annettuKoodi.equals(oikeaKoodi)) {
                koodiOikein = true;
                break;
            } else {
                System.out.println("Syötit väärän koodin!");
            }
        }

        if (koodiOikein) {
            System.out.println("Oikea koodi!");
        } else {
            System.out.println("Tili lukittu!");
        }
    }
}
