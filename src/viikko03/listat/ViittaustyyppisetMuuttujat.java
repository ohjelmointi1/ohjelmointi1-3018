package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class ViittaustyyppisetMuuttujat {

    public static void main(String[] args) {
        // lista naisten etunimiä
        List<String> naiset = new ArrayList<>();
        naiset.add("Tuula");
        naiset.add("Anne");
        naiset.add("Päivi");
        naiset.add("Anna");

        // lista miesten etunimiä
        List<String> miehet = new ArrayList<>();
        miehet.add("Juha");
        miehet.add("Timo");
        miehet.add("Matti");
        miehet.add("Kari");

        // lista, jossa molempia nimiä
        List<String> molemmat = new ArrayList<>(naiset);
        molemmat.addAll(miehet);

        System.out.println("Naiset " + naiset);
        System.out.println("Miehet " + miehet);
        System.out.println("Molemmat " + molemmat);
    }
}
