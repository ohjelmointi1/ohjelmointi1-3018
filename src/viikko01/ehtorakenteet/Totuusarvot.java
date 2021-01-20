package viikko01.ehtorakenteet;

public class Totuusarvot {

    public static void main(String[] args) {
        boolean tosi = true;

        boolean epatosi = false;

        System.out.println(tosi);

        System.out.println(epatosi);

        System.out.println(!true);

        System.out.println(!false);

        boolean onKantaAsiakas = false;
        boolean pyydaLiittymaan = !onKantaAsiakas;
    }
}
