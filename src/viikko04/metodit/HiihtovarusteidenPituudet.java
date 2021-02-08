package viikko04.metodit;

import java.util.Scanner;

public class HiihtovarusteidenPituudet {

    public static void main(String[] args) {
        AjankohdanTulostaminen.tulostaPaivamaara();

        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä hiihtäjän pituus: ");
        int hiihtajanPituus = lukija.nextInt();

        System.out.println();

        int sauvanPituus = laskeSauvanPituus(hiihtajanPituus);
        System.out.println("Suositeltu sauvan pituus: " + sauvanPituus + " cm");

        int suksenPituus = laskeSuksenPituus(hiihtajanPituus);
        System.out.println("Suositeltu suksen pituus: " + suksenPituus + " cm");
    }

    public static int laskeSuksenPituus(int hiihtaja) {
        return laskeSauvanPituus(hiihtaja) + 40;
    }

    public static int laskeSauvanPituus(int hiihtaja) {
        int tarkkaArvio = (int) Math.round(hiihtaja * 0.85);
        return Pyoristykset.pyoristaLahimpaanVitoseen(tarkkaArvio);
    }

}
