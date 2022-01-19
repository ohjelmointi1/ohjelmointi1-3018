package viikko01.ehtorakenteet;

public class TrueJaFalse {

    public static void main(String[] args) {
        boolean tosi = true;
        boolean epatosi = false;

        System.out.println(tosi);
        System.out.println(epatosi);

        System.out.println();

        System.out.println(!tosi);
        System.out.println(!epatosi);

        System.out.println();

        int ika = 25;

        boolean taysiIkainen = (ika >= 18);
        boolean palvelusIkainen = taysiIkainen && (ika < 30);

        System.out.println("Täysi-ikäinen: " + taysiIkainen);
        System.out.println("Palvelusikäinen: " + palvelusIkainen);
        System.out.println("Ei palvelusikäinen: " + !palvelusIkainen);

        System.out.println();

        String nimi = "Henni";
        String nimipaivasankarit = "Heikki, Henri, Henna, Henrik, Henni, Henriikka ja Henrikki";

        boolean onNimipaiva = nimipaivasankarit.contains(nimi);

        if (onNimipaiva) {
            System.out.println("Hyvää nimipäivää " + nimi + "!");
        } else {
            System.out.println("Tänään ei ole nimipäiväsi, " + nimi);
        }
    }
}
