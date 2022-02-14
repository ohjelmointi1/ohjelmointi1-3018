package viikko05.aikaolio;

import java.time.LocalDate;

public class Aikaoliot {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();
        LocalDate ensiViikko = tanaan.plusDays(7);

        System.out.println(tanaan);
        System.out.println(ensiViikko);

        if (tanaan.isBefore(ensiViikko)) {
            System.out.println(tanaan + " on ennen " + ensiViikko);
        }
    }
}
