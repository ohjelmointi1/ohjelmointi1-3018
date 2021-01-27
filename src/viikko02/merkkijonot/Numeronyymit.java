package viikko02.merkkijonot;

public class Numeronyymit {

    public static void main(String[] args) {
        // indeksit alkavat aina nollasta
        String sana = "internationalization"; // todo: muuta käyttämään Scanneria

        // "endIndex" ei tule mukaan merkkijonoon:
        String ekaKirjain = sana.substring(0, 1);

        int pituus = sana.length();

        // viimeinen indeksi on AINA pituus-1
        String vikaKirjain = sana.substring(pituus - 1);

        int keskikohdanPituus = (pituus - 2);

        String numeronyymi = ekaKirjain + keskikohdanPituus + vikaKirjain;
        System.out.println(numeronyymi);
    }
}
