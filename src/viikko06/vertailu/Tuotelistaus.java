package viikko06.vertailu;

import java.util.ArrayList;

public class Tuotelistaus {

    public static void main(String[] args) {
        Tuote muki = new Tuote("Muumimuki");
        Tuote lautanen = new Tuote("Muumilautanen");
        Tuote setti = new Tuote("Muumisetti");

        ArrayList<Tuote> tuotteet = new ArrayList<>();
        tuotteet.add(muki);
        tuotteet.add(lautanen);
        tuotteet.add(setti);

        System.out.println(tuotteet);

        Tuote etsittava = new Tuote("Muumilautanen");

        System.out.println("Vertailu == : " + (etsittava == lautanen));
        System.out.println("Vertailu equals: " + etsittava.equals(lautanen));

        boolean loytyy = tuotteet.contains(etsittava);
        int indeksi = tuotteet.indexOf(etsittava);

        System.out.println("Löytyykö? " + loytyy);
        System.out.println("Mistä indeksistä? " + indeksi);
    }
}
