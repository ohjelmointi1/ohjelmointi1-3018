package viikko04.aika;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Juhlapyhat {

    public static void main(String[] args) {
        System.out.println("Subject, Start date");
        for (int v = Year.now().getValue(); v < 2024; v++) {
            tulostaJuhlapyhat(v);
        }
    }

    private static void tulostaJuhlapyhat(int vuosi) {
        tulostaJuhlapyha("Uudenvuoden päivä", LocalDate.of(vuosi, 1, 1));
        tulostaJuhlapyha("Loppiainen", LocalDate.of(vuosi, 1, 6));
        tulostaJuhlapyha("Pitkäperjantai", laskePitkaperjantai(vuosi));
        tulostaJuhlapyha("Pääsiäispäivä", laskePaasiaispaiva(vuosi));
        tulostaJuhlapyha("Vappu", LocalDate.of(vuosi, 5, 1));
        tulostaJuhlapyha("Helatorstai", laskeHelatorstai(vuosi));
        tulostaJuhlapyha("Helluntai", laskeHelluntai(vuosi));
        // TODO: lisää juhannus yms. puuttuvat päivät
    }

    private static void tulostaJuhlapyha(String nimi, LocalDate pvm) {
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(nimi + ", " + pvm.format(muotoilu));
    }

    private static LocalDate laskeHelatorstai(int vuosi) {
        return laskePaasiaispaiva(vuosi).plusDays(39);
    }

    private static LocalDate laskeHelluntai(int vuosi) {
        return laskePaasiaispaiva(vuosi).plusDays(49);
    }

    private static LocalDate laskePitkaperjantai(int vuosi) {
        LocalDate paasiainen = laskePaasiaispaiva(vuosi);
        return paasiainen.minusDays(2);
    }

    private static LocalDate laskePaasiaispaiva(int vuosi) {
        // TODO: lisää muiden vuosien pääsiäiset
        List<LocalDate> paasiaiset = List.of(LocalDate.of(2021, 4, 4), LocalDate.of(2022, 4, 17),
                LocalDate.of(2023, 4, 9));

        for (LocalDate paasiainen : paasiaiset) {
            if (paasiainen.getYear() == vuosi) {
                return paasiainen;
            }
        }
        return null;
    }
}
