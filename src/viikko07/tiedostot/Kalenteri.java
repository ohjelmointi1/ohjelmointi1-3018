package viikko07.tiedostot;

import java.util.ArrayList;
import java.util.List;

public class Kalenteri {

    private List<Tapahtuma> tapahtumat = new ArrayList<>();
    private String nimi;

    public Kalenteri(String nimi) {
        this.nimi = nimi;
    }

    public void lisaaTapahtuma(Tapahtuma uusiTapahtuma) {
        this.tapahtumat.add(uusiTapahtuma);
    }

    @Override
    public String toString() {
        String merkkijono = "Kalenteri " + this.nimi + ":\n";
        for (Tapahtuma t : this.tapahtumat) {
            merkkijono += " * " + t.toString() + "\n";
        }
        return merkkijono;
    }
}
