package viikko03.taulukot;

public class Alkuluku {

    public static void main(String[] args) {
        boolean[] jaolliset = new boolean[10_000_000];

        // merkataan kaikki luvut, jotka ovat jaollisia toisella
        for (int luku = 2; luku < jaolliset.length; luku++) {
            boolean onAlkuluku = (jaolliset[luku] == false);

            if (onAlkuluku) {
                for (int kertoma = 2; luku * kertoma < jaolliset.length; kertoma++) {
                    jaolliset[kertoma * luku] = true;
                }
            }
        }

        for (int i = 2; i < jaolliset.length; i++) {
            boolean onJaollinenToisella = jaolliset[i];

            if (onJaollinenToisella == false) {
                System.out.println("Luku " + i + " on alkuluku");
            }
        }
    }
}
