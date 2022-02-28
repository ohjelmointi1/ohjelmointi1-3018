package viikko06.juhlapyhat;

import java.time.LocalDate;

public class Pyhapaiva {

    private String nimi;
    private LocalDate pvm;

    public Pyhapaiva(String nimi, String pvmString) {
        this.nimi = nimi;
        this.pvm = LocalDate.parse(pvmString);
    }

    public int vertaile(Pyhapaiva toinen) {
        // negatiivista, nolla tai positiivista riippuen siitä, onko
        // tämä pvm ennen, sama tai jälkeen toisen päivän
        return this.pvm.compareTo(toinen.pvm);
    }

    @Override
    public boolean equals(Object toinen) {
        if (toinen instanceof Pyhapaiva) {
            Pyhapaiva toinenPaiva = (Pyhapaiva) toinen;
            return this.nimi.equals(toinenPaiva.nimi) && this.pvm.equals(toinenPaiva.pvm);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nimi + " (" + this.pvm + ")";
    }
}
