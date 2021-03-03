package viikko05.oliot.henkilotiedot;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Henkilotieto {

    private String nimi;
    private LocalDate syntymapaiva;
    private List<Henkilotieto> lapset = new ArrayList<>(); // voitaisiin kirjoittaa myös konstruktoriin

    public Henkilotieto(String nimi, int paiva, int kuukausi, int vuosi) {
        this.nimi = nimi;
        this.setSyntymaAika(paiva, kuukausi, vuosi);
    }

    public String getNimi() {
        return this.nimi;
    }

    public void lisaaLapsi(Henkilotieto lapsi) {
        this.lapset.add(lapsi);
    }

    public int getSyntymaVuosi() {
        return syntymapaiva.getYear();
    }

    public void setSyntymaAika(int paiva, int kuukausi, int vuosi) {
        LocalDate syntyma = LocalDate.of(vuosi, kuukausi, paiva);
        LocalDate tanaan = LocalDate.now();

        if (syntyma.isAfter(tanaan)) {
            IllegalArgumentException poikkeus = new IllegalArgumentException(
                    "Syntymäpäivä ei voi olla tulevaisuudessa!");
            throw poikkeus;
        } else {
            this.syntymapaiva = syntyma;
        }
    }

    public boolean onTaysiIkainen() {
        int ika = this.laskeIka();
        return ika >= 18;
    }

    public int laskeIka() {
        return (int) ChronoUnit.YEARS.between(this.syntymapaiva, LocalDate.now());
    }

    @Override
    public String toString() {
        String nimiJaIka = this.nimi + ", " + this.laskeIka() + " v";
        if (this.lapset.isEmpty()) {
            return nimiJaIka;
        } else {
            return nimiJaIka + ", " + this.lapset.size() + " lasta:\n" + this.muodostaLapsiLista();
        }
    }

    private String muodostaLapsiLista() {
        String lapsiLista = "";
        for (Henkilotieto lapsi : this.lapset) {
            String lapsenNimi = lapsi.getNimi();
            lapsiLista += "- " + lapsenNimi + "\n";
        }
        return lapsiLista;
    }
}
