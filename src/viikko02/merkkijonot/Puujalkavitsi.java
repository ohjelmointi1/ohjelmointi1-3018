package viikko02.merkkijonot;

import java.util.Scanner;

public class Puujalkavitsi {

    public static void main(String[] args) {
        String kysymys = "Miksi kutsutaan sellaista, joka ei käytä euroja, vaan muita rahoja?";
        System.out.println(kysymys);

        Scanner lukija = new Scanner(System.in);

        String oikeaVastaus = "muurahaiseksi";
        String arvaus = lukija.nextLine();

        if (arvaus.equals(oikeaVastaus)) {
            System.out.println("Oikein!");
        } else {
            System.out.println("Väärin!");
        }
    }
}
