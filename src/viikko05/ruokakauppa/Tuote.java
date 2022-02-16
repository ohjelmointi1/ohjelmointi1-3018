package viikko05.ruokakauppa;

public class Tuote {

    private String nimi;
    private double hinta; // €
    private double paino; // kg
    private TuoteKuva kuva;

    public Tuote() {
        /*
         * Täällä ei tehdä mitään, mutta konstruktori on silti pakollinen, jos olioita
         * halutaan luoda myös ilman parametreja.
         */
    }

    public Tuote(String nimi, double hinta, double paino) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.paino = paino;
    }

    public void setKuva(TuoteKuva kuva) {
        this.kuva = kuva;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public void setPaino(double paino) {
        this.paino = paino;
    }

    public double laskeKilohinta() {
        double kilohinta = this.hinta / this.paino;
        return kilohinta;
    }

    public boolean onHalvempiKilohinta(Tuote toinen) {
        return this.laskeKilohinta() < toinen.laskeKilohinta();
    }

    public String toHtml() {
        String html = """
                <div>
                    <h3>$nimi</h3>
                    $kuva
                </div>
                """.replace("$nimi", this.nimi);

        if (this.kuva != null) {
            return html.replace("$kuva", this.kuva.toHtml());
        } else {
            return html.replace("$kuva", "<!-- ei kuvaa -->");
        }
    }

    @Override
    public String toString() {
        double kilohinta = this.laskeKilohinta();
        return this.nimi + " (" + this.hinta + " €, " + this.paino + " kg, " + kilohinta + " €/kg)";
    }
}
