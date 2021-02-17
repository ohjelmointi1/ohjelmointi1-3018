package viikko05.oliot.oliotlistoilla;

public class Yhteystieto {

    private String nimi;
    private String email;
    private String puhelin;

    public Yhteystieto(String nimi, String email, String puhelin) {
        this.nimi = nimi;
        this.email = email;
        this.puhelin = puhelin;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, %s)", this.nimi, this.email, this.puhelin);
    }
}
