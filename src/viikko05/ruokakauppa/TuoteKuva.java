package viikko05.ruokakauppa;

public class TuoteKuva {

    private int leveys;
    private int korkeus;
    private String tiedosto;
    private String kuvateksti;

    public TuoteKuva(int leveys, int korkeus, String tiedosto, String kuvateksti) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.tiedosto = tiedosto;
        this.kuvateksti = kuvateksti;
    }

    // TODO: kuvan skaalaus tiettyyn kokoon?
    public String toHtml() {
        return "<img src='" + this.tiedosto + "' alt='" + this.kuvateksti + "' width='" + this.leveys + "' height='"
                + this.korkeus + "' />";
    }
}
