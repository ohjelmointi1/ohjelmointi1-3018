package viikko03.taulukot;

public class Alkuluku {

    public static void main(String[] args) {
        // taulukko jaollisista ja "jaottomista" luvuista (eli alkuluvuista)
        boolean[] jaolliset = new boolean[10_000_000];

        // asetetaan `true` kaikkiin niihin indekseihin, jotka ovat
        // jaollisia jollain muulla luvulla
        for (int luku = 2; luku < jaolliset.length; luku++) {
            boolean onAlkuluku = (jaolliset[luku] == false);

            if (onAlkuluku) {
                for (int kertoma = 2; luku * kertoma < jaolliset.length; kertoma++) {
                    jaolliset[kertoma * luku] = true;
                }
            }
        }

        // Tulostetaan kaikki luvut, jotka eivät ole jaollisia muilla
        for (int i = 2; i < jaolliset.length; i++) {
            boolean onJaollinenToisella = jaolliset[i];

            if (onJaollinenToisella == false) {
                System.out.println("Luku " + i + " on alkuluku");
            }
        }
    }
}
