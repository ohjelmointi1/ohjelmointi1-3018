package viikko05.oliot.oliotlistoilla;

import java.util.ArrayList;
import java.util.List;

public class OsoitekirjaOhjelma {

    public static void main(String[] args) {
        Yhteystieto lindsey = new Yhteystieto("Lindsey", "ldrillingcourt0@so-net.ne.jp", "132-414-7730");
        Yhteystieto zilvia = new Yhteystieto("Zilvia", "zzamboniari1@dell.com", "445-276-2785");
        Yhteystieto moses = new Yhteystieto("Moses", null, "681-240-4656");

        System.out.println(lindsey);
        System.out.println(zilvia);
        System.out.println(moses);

        List<Yhteystieto> yhteystiedot = new ArrayList<>();
        yhteystiedot.add(lindsey);
        yhteystiedot.add(zilvia);
        yhteystiedot.add(moses);

        System.out.println(yhteystiedot);

        Yhteystieto yksi = yhteystiedot.get(1);
        yksi.setNimi("Zilvia Smith"); // tämä muutos vaikuttaa sekä tähän, että zilvia-muuttujaan + listaan

        System.out.println(zilvia);
        System.out.println(yhteystiedot);
    }
}
