package viikko05.ruokakauppa;

public class Tuote {

    // FIXME: nämä pitäisi olla private-näkyvyydellä
    String nimi;
    double hinta; // €
    double paino; // kg

    public double laskeKilohinta() {
        double kilohinta = hinta / paino;
        return kilohinta;
    }

    public boolean onHalvempiKilohinta(Tuote toinen) {
        return this.laskeKilohinta() < toinen.laskeKilohinta();
    }

    @Override
    public String toString() {
        double kilohinta = this.laskeKilohinta();
        return this.nimi + " (" + this.hinta + " €, " + this.paino + " kg, " + kilohinta + " €/kg)";
    }
}
