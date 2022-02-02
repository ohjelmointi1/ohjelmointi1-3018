package viikko03.taulukot;

import java.util.Arrays;
import java.util.List;

public class NimipaivatListanAvulla {

    public static void main(String[] args) {
        String nimipaivasankarit = "Jemina, Lumi ja Aamu";
        String nimi = "Jemina";

        String[] nimet = nimipaivasankarit.replace(" ja ", ", ").split(", ");
        List<String> nimiLista = Arrays.asList(nimet);

        if (nimiLista.contains(nimi)) {
            System.out.println("Hyvää nimipäivää " + nimi);
        }
    }
}
