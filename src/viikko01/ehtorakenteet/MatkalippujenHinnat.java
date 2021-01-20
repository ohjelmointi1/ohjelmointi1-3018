package viikko01.ehtorakenteet;

import java.util.Scanner;

public class MatkalippujenHinnat {

    public static void main(String[] args) {
        final double KUUKAUSILIPPU = 62.7;
        final double OPISKELIJAN_KK = 34.5;
        final double KERTALIPPU = 2.8;

        Scanner lukija = new Scanner(System.in);
        System.out.println("Oletko opiskelija? 0=ei 1=kyllä");

        int vastaus = lukija.nextInt();
        boolean opiskelija = (vastaus == 1);

        System.out.println("Kuinka monta matkaa teet kuukaudessa?");
        int matkat = lukija.nextInt();

        double kertalippujenSumma = KERTALIPPU * matkat;
        double kuukausilipunHinta = KUUKAUSILIPPU;

        if (opiskelija) {
            kuukausilipunHinta = OPISKELIJAN_KK; // korvaa hinta alennetulla
        }

        double erotus = Math.abs(kertalippujenSumma - kuukausilipunHinta);

        if (kertalippujenSumma > kuukausilipunHinta) {
            System.out.println("Osta kuukausilippu, säästät " + erotus + " euroa");
        } else {
            System.out.println("Osta kertalippuja, säästät " + erotus + " euroa");
        }
    }
}
