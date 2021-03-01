package viikko06.vertailu;

public class Tuote {

    private String nimi;
    private double hinta;

    public Tuote(String nimi) {
        this.nimi = nimi;
    }

    public Tuote(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public String getNimi() {
        return this.nimi;
    }

    public double getHinta() {
        return this.hinta;
    }

    @Override
    public boolean equals(Object toinen) {
        if (toinen instanceof Tuote) {
            Tuote toinenTuote = (Tuote) toinen;
            return this.nimi.equals(toinenTuote.nimi) && this.hinta == toinenTuote.hinta;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.hinta + ")";
    }
}
