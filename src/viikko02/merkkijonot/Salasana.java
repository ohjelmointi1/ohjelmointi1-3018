package viikko02.merkkijonot;

import java.util.Random;

public class Salasana {

    public static void main(String[] args) {
        Random satunnaisGeneraattori = new Random();
        int pituus = 64;

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

        System.out.println(salasana);
    }
}
