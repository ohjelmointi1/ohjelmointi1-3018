package viikko06.poikkeukset;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PoikkeuksiinVarautuminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String[] paivat = "maanantai tiistai keskiviikko torstai perjantai lauantai sunnuntai".split(" ");

        try {
            System.out.print("Syötä päivän numero (1-7): ");
            int indeksi = lukija.nextInt() - 1;

            String paiva = paivat[indeksi];
            System.out.println(paiva);

        } catch (InputMismatchException syotePoikkeus) {
            System.err.println("Virheellinen syöte!");

            syotePoikkeus.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException indeksiPoikkeus) {
            String virheviesti = indeksiPoikkeus.getMessage();
            System.err.println("Anna numero väliltä 1-7! " + virheviesti);

            indeksiPoikkeus.printStackTrace();

        } finally {
            lukija.close();

        }
    }
}
