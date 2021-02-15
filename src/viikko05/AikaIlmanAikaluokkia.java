package viikko05;

import java.time.LocalDate;

public class AikaIlmanAikaluokkia {

    public static void main(String[] args) {
        int vuosi1 = 2021;
        int kuukausi1 = 2;
        int paiva1 = 15;

        int[] paivamaara = { 2021, 2, 15 };

        String pvm = "2021-02-15";

        // eineksen parasta ennen päivä: nykyinen + 21

        LocalDate valmistuspaiva = LocalDate.parse("2021-02-15");
        LocalDate parastaEnnen = valmistuspaiva.plusDays(21);
        System.out.println(parastaEnnen);
    }
}
