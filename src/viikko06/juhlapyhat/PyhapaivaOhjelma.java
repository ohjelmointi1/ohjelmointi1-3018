package viikko06.juhlapyhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PyhapaivaOhjelma {

    public static void main(String[] args) {
        Pyhapaiva kalevalanPaiva = new Pyhapaiva("Kalevalan päivä", "2022-02-28");
        Pyhapaiva laskiaisTiistai = new Pyhapaiva("Laskiaistiistai", "2022-03-01");
        Pyhapaiva jouluaatto = new Pyhapaiva("Jouluaatto", "2022-12-24");

        List<Pyhapaiva> paivat = new ArrayList<>();

        paivat.add(jouluaatto);
        paivat.add(kalevalanPaiva);
        paivat.add(laskiaisTiistai);

        System.out.println(paivat);

        Collections.sort(paivat, Pyhapaiva::vertaile);

        System.out.println(paivat);

        Pyhapaiva tanaan = new Pyhapaiva("Kalevalan päivä", "2022-02-28");

        System.out.println("Vertaillaan kahta erilaista (kalevala ja laskiainen):");
        System.out.println(kalevalanPaiva.equals(laskiaisTiistai));

        System.out.println("Löytyykö tämä päivä? " + tanaan);
        System.out.println(paivat.contains(tanaan));
        System.out.println("Kalevalan päivän indeksi: " + paivat.indexOf(tanaan));
    }
}
