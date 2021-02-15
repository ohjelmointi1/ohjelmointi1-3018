package viikko05.oliot.kaupungitV1;

public class Kaupunki {

    String nimi;
    int vakiluku;
    double pintaAla;

    public double laskeVaestontiheys() {
        return this.vakiluku / this.pintaAla;
    }

    public boolean vakilukuSuurempiKuin(Kaupunki toinen) {
        return this.vakiluku > toinen.vakiluku;
    }
}
