package viikko01.ehtorakenteet;

public class Kasino {

    public static void main(String[] args) {
        int ika = 19;

        boolean taysiIkainen = ika >= 18;

        if (taysiIkainen) {
            System.out.println("Tervetuloa kasinolle!");
        } else {
            System.out.println("Ikä ei valitettavasti riitä :(");
        }
    }
}
