package viikko03.taulukot;

public class TaulukonLuominen {

    public static void main(String[] args) {

        int[] lottonumerot = new int[7];
        lottonumerot[0] = 10;
        lottonumerot[1] = 15;

        System.out.println(lottonumerot[0]);

        int toinenArvo = lottonumerot[1];
        System.out.println(toinenArvo);

        int pituus = lottonumerot.length;
        System.out.println("Taulukon pituus: " + pituus);

        // taulukkoon voidaan lisätä mihin tahansa indeksiin:
        lottonumerot[pituus - 1] = 27;

        for (int i = 0; i < pituus; i++) {
            System.out.println("Indeksi " + i + ": " + lottonumerot[i]);
        }
    }
}
