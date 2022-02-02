package viikko03.taulukot;

public class Nimipaivat {

    public static void main(String[] args) {
        String nimipaivasankarit = "Jemina, Lumi ja Aamu";

        String[] nimet = nimipaivasankarit.replace(" ja ", ", ").split(", ");

        String nimi = "Jemina";

        for (int i = 0; i < nimet.length; i++) {
            String paivansankari = nimet[i];
            if (paivansankari.equalsIgnoreCase(nimi)) {
                System.out.println("Hyvää nimipäivää " + nimi);
            }
        }
    }
}
