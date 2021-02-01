package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class Hiihtojoukkue {

    public static void main(String[] args) {
        // Lähde: https://yle.fi/urheilu/3-11764995
        String vilma = "Vilma Nissinen";
        String anne = "Anne Kyllönen";
        String jasmi = "Jasmi Joensuu";
        String riittaLiisa = "Riitta-Liisa Roponen";

        List<String> hiihtajat = new ArrayList<>();
        hiihtajat.add(vilma);
        hiihtajat.add(anne);
        hiihtajat.add(jasmi);
        hiihtajat.add(riittaLiisa);

        System.out.println(hiihtajat);

        int pituus = hiihtajat.size();

        String eka = hiihtajat.get(0);
        String toka = hiihtajat.get(1);
        String viimeinen = hiihtajat.get(pituus - 1);

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(viimeinen);
    }
}
