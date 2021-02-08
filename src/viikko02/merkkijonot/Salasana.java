package viikko02.merkkijonot;

import java.util.Random;

public class Salasana {

    public static void main(String[] args) {
        System.out.println(generoiSalasana(64));
    }

    public static String generoiSalasana(int pituus) {
        Random satunnaisGeneraattori = new Random();

        // koostuu satunnaisista kirjaimista a-z, A-Z, 0-9 ja joistakin erikoismerkeistä
        String pienetKirjaimet = "abcdefghijklmnopqrstuvwxyzåäö";
        String isotKirjaimet = pienetKirjaimet.toUpperCase();
        String numerot = "0123456789";
        String erikoismerkit = "<>,;.:-!\"#¤$%&/\\()[]";

        String merkit = pienetKirjaimet + isotKirjaimet + numerot + erikoismerkit;

        String salasana = "";

        while (salasana.length() < pituus) {
            int satunnaisluku = satunnaisGeneraattori.nextInt(merkit.length());
            String satunnainenMerkki = merkit.substring(satunnaisluku, satunnaisluku + 1);
            salasana = salasana + satunnainenMerkki;
        }

        return salasana;
    }
}
