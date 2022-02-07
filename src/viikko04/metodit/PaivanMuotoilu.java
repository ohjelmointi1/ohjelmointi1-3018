package viikko04.metodit;

import java.time.LocalDate;

public class PaivanMuotoilu {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();
        tulostaSuomeksi(tanaan);

        LocalDate erapaiva = tanaan.plusDays(31);
        String erapaivaTekstina = muotoilePaivamaara(erapaiva);
        System.out.println("Eräpäivä on " + erapaivaTekstina + ".");

        System.out.println("Parasta ennen päiväys on " + muotoilePaivamaara(tanaan.plusDays(4)) + ".");
    }

    public static void tulostaSuomeksi(LocalDate pvm) {
        String muotoiltu = muotoilePaivamaara(pvm);
        System.out.println("Tänään on " + muotoiltu + ".");
    }

    public static String muotoilePaivamaara(LocalDate pvm) {
        String paivaNimi = kerroViikonpaiva(pvm);
        String kuukausiNimi = kerroKuukausi(pvm);

        return paivaNimi + " " + pvm.getDayOfMonth() + ". " + kuukausiNimi + "ta " + pvm.getYear();
    }

    private static String kerroKuukausi(LocalDate pvm) {
        String[] kuukaudet = { "tammi", "helmi", "maalis", "huhti", "touko", "kesä", "heinä", "elo", "syys", "loka",
                "marras", "joulu" };
        return kuukaudet[pvm.getMonthValue() - 1] + "kuu";
    }

    private static String kerroViikonpaiva(LocalDate pvm) {
        String[] paivat = { "maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai" };
        return paivat[pvm.getDayOfWeek().getValue() - 1];
    }

}
