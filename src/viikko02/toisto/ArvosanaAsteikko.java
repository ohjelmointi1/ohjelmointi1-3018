package viikko02.toisto;

import arviointi.OsasuoritustenArviointi;

public class ArvosanaAsteikko {

    public static void main(String[] args) {
        final int MAKSIMI = 25;

        for (int pisteet = 0; pisteet <= MAKSIMI; pisteet++) {
            double arvosana = OsasuoritustenArviointi.laskeArvosana(pisteet, MAKSIMI);
            System.out.println(pisteet + "," + arvosana + "," + Math.round(arvosana));
        }

    }
}
