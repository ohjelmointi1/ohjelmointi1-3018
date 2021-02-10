package viikko04.aika;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NykyinenAjanhetki {

    public static void main(String[] args) {
        LocalTime klo = LocalTime.now();
        LocalDate tanaan = LocalDate.now();
        LocalDateTime kloJaPvm = LocalDateTime.now();

        System.out.println("Nykyinen klo: " + klo);
        System.out.println("Nykyinen pvm: " + tanaan);
        System.out.println("Nykyinen ajanhetki: " + kloJaPvm);

        System.out.println();

        LocalDate joulu = LocalDate.of(2021, 12, 24);
        System.out.println("Joulu: " + joulu);

        System.out.println();

        System.out.println("Copyright © " + tanaan.getYear());

        System.out.println();

        if (kloJaPvm.getHour() < 12) {
            System.out.println("Hyvää aamupäivää!");
        }
    }
}
