package viikko06.vertailu;

public class OlionLuokanSelvittaminen {

    public static void main(String[] args) {
        Object mikaTahansaOlio = new Tuote("Muumimuki");
        Object toinenOlio = "olen merkkijono";

        if (mikaTahansaOlio instanceof Tuote) {
            System.out.println("mikaTahansaOlio on tuote!");

            Tuote tuoteOlio = (Tuote) mikaTahansaOlio;
            System.out.println(tuoteOlio.getNimi());
        }
    }
}
