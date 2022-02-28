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
        if (toinen.getClass() != this.getClass()) {
            return false;
        } else {
            String tamaStr = this.toString();
            String toinenStr = toinen.toString();
            return toinenStr.equals(tamaStr);
        }
    }

    @Override
    public String toString() {
        return nimi + " (" + this.pvm + ")";
    }
}
