package viikko01.perusteet;

import java.text.DecimalFormat;

public class DesimaalienTulostaminen {

    public static void main(String[] args) {
        // Tulostaa rahamäärän korkeintaan kahdella desimaalilla.
        // Tarvittaessa käytetään tuhaterotinta:
        DecimalFormat euroMuoto = new DecimalFormat("#,###.## €");

        String pitkaTuloste = euroMuoto.format(1523.45);

        System.out.println(pitkaTuloste); // 1 523,45 €

        // Jos desimaaliosa päättyy nolliin, se nollat jäävät pois:
        String lyhytTuloste = euroMuoto.format(123.00);

        System.out.println(lyhytTuloste); // 123 €
    }
}
