package viikko06.juhlapyhat;

public class Pyhapaiva {

    private String nimi;
    private String pvm;

    public Pyhapaiva(String nimi, String pvm) {
        this.nimi = nimi;
        this.pvm = pvm;
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
