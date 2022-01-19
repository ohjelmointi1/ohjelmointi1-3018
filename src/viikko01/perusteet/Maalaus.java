package viikko01.perusteet;

public class Maalaus {

    public static void main(String[] args) {
        System.out.println("Anna huoneen leveys, pituus ja korkeus: ");

        double leveys = 3.40;
        double pituus = 3.0;
        double korkeus = 2.5;

        double nelioitaLitralla = 5.0;

        double seina1 = leveys * korkeus;
        double seina2 = pituus * korkeus;

        double pintaAla = seina1 * 2 + seina2 * 2;

        double maalinKulutus = pintaAla / nelioitaLitralla;

        System.out.println("Maalin tarve on " + maalinKulutus + " litraa");
    }
}