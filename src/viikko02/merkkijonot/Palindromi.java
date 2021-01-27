package viikko02.merkkijonot;

public class Palindromi {

    public static void main(String[] args) {
        String alkuperainen = "Iso, rikas sika sökösakissa kirosi."; // https://fi.wikipedia.org/wiki/Palindromi

        // poistetaan kaikki merkit, paitsi kirjaimet a-z ja åäö:
        String virke = alkuperainen.toLowerCase().replaceAll("[^a-zåäö]", "");

        int ekaIndeksi = 0;
        int vikaIndeksi = virke.length() - 1;

        int alku = ekaIndeksi;
        int loppu = vikaIndeksi;

        boolean onPalindromi = true; // yksisuuntainen lippu

        while (alku < loppu) {
            char alkuMerkki = virke.charAt(alku);
            char loppuMerkki = virke.charAt(loppu);

            if (alkuMerkki != loppuMerkki) {
                onPalindromi = false;
                break;
            }

            alku++;
            loppu--;
        }

        if (onPalindromi) {
            System.out.println(alkuperainen + " on palindromi!");
        } else {
            System.out.println(alkuperainen + " ei ole palindromi!");
        }

    }
}
