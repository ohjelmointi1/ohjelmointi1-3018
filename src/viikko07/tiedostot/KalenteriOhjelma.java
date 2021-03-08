package viikko07.tiedostot;

import java.util.List;

public class KalenteriOhjelma {

    public static void main(String[] args) {
        KalenterinLukija lukija = new KalenterinLukija("juhlapyhat.csv");

        Kalenteri juhlaKalenteri = new Kalenteri("Juhlat");

        List<Tapahtuma> tapahtumat = lukija.lueTapahtumat();

        for (Tapahtuma t : tapahtumat) {
            juhlaKalenteri.lisaaTapahtuma(t);
        }

        System.out.println(juhlaKalenteri);
    }
}
