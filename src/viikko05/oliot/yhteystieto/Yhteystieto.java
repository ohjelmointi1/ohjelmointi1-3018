package viikko05.oliot.yhteystieto;

public class Yhteystieto {

    private String nimi;
    private String email;
    private String puhelin;

    public String getPuhelin() {
        return puhelin;
    }

    public void setPuhelin(String puhelin) {
        this.puhelin = puhelin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "Yhteystieto [nimi=" + nimi + ", email=" + email + ", puhelin=" + puhelin + "]";
    }
}
