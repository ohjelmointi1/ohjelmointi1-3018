package viikko04.aika;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PaivamaaranParsiminen {

    public static void main(String[] args) {
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("d.M.yyyy");
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä päivämäärä (p.k.vvvv): ");
        String pvmMerkkijono = lukija.nextLine();

        LocalDate kayttajanPaiva = LocalDate.parse(pvmMerkkijono, muotoilu);

        System.out.println(kayttajanPaiva.getYear());
        System.out.println(kayttajanPaiva.getMonthValue());
        System.out.println(kayttajanPaiva.getDayOfMonth());

        System.out.println(kayttajanPaiva.format(muotoilu));
    }
}
