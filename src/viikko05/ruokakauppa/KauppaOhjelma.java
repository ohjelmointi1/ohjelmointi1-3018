package viikko05.ruokakauppa;

import java.util.ArrayList;
import java.util.List;

public class KauppaOhjelma {

    public static void main(String[] args) {

        Tuote juustoviipaleet = new Tuote("Juustoviipaleet", 3.59, 0.5);
        TuoteKuva viipalekuva = new TuoteKuva(1200, 1200, "viipaleet.jpg", "Juustoviipaleet");
        juustoviipaleet.setKuva(viipalekuva);

        Tuote juustokimpale = new Tuote();
        juustokimpale.setNimi("Kermajuusto");
        juustokimpale.setHinta(6.39);
        juustokimpale.setPaino(1.0);

        Tuote homejuusto = new Tuote();
        homejuusto.setNimi("Homejuustopala");
        homejuusto.setHinta(2.89);
        homejuusto.setPaino(0.17);

        // Tulostetaan tuotteiden tiedot:
        List<Tuote> tuotteet = new ArrayList<>();
        tuotteet.add(juustoviipaleet);
        tuotteet.add(juustokimpale);
        tuotteet.add(homejuusto);

        for (Tuote t : tuotteet) {
            System.out.println(t.toHtml());
        }
    }
}
