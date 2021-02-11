package viikko04.aika;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Myohastymismaksu {
    static final int LAINA_AIKA = 28;
    static final double MYOHASTYMISMAKSU_PV = 0.2;
    static final int MYOHASTYMISMAKSU_MAX = 6;

    public static void main(String[] args) {
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("d.M.yyyy");
        Scanner lukija = new Scanner(System.in);

        System.out.print("Milloin lainasit kirjan (p.k.vvvv)? ");
        LocalDate lainausPaiva = LocalDate.parse(lukija.nextLine(), muotoilu);

        LocalDate erapaiva = lainausPaiva.plusDays(LAINA_AIKA);

        LocalDate tanaan = LocalDate.now();

        boolean onMyohassa = tanaan.isAfter(erapaiva);

        System.out.println("Eräpäivä: " + erapaiva.format(muotoilu));

        if (tanaan.isBefore(lainausPaiva)) {
            System.out.println("Lainauspäivä on tulevaisuudessa!");
        } else if (onMyohassa == false) {
            System.out.println("Kirja ei ole myöhässä.");
        } else {
            int myohassaPaivia = (int) ChronoUnit.DAYS.between(erapaiva, tanaan);
            System.out.println("Kirja on myöhässä " + myohassaPaivia + " päivää!");
            double myohastymismaksu = laskeMyohastymismaksu(myohassaPaivia);
            System.out.println("Myöhästymismaksu: " + myohastymismaksu + " euroa.");
        }
    }

    private static double laskeMyohastymismaksu(int paivat) {
        return Math.min(paivat * MYOHASTYMISMAKSU_PV, MYOHASTYMISMAKSU_MAX);
    }
}
