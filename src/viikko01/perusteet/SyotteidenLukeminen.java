package viikko01.perusteet;

import java.util.Scanner;

// Älä kopioi malliratkaisua suoraan Viopeen, mutta saat käyttää sitä mallina
public class SyotteidenLukeminen {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä nimesi: ");
        String etunimi = lukija.nextLine(); // => kysytään nimeä, "Matti"

        System.out.println("Hei " + etunimi + "!");
    }
}
