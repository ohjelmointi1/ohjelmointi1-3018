package viikko07.tiedostot;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tapahtuma {

    private String nimi;
    private LocalDate paivamaara;

    public Tapahtuma(String nimi, LocalDate paivamaara) {
        this.nimi = nimi;
        this.paivamaara = paivamaara;
    }

    public String getNimi() {
        return nimi;
    }

    public LocalDate getPaivamaara() {
        return paivamaara;
    }

    @Override
    public String toString() {
        DateTimeFormatter muotoilija = DateTimeFormatter.ofPattern("d.M.yyyy");
        return muotoilija.format(this.paivamaara) + " " + this.nimi;
    }

    public static Tapahtuma parse(String merkkijono) {
        int pilkku = merkkijono.lastIndexOf(",");

        String nimi = merkkijono.substring(0, pilkku);
        String pvm = merkkijono.substring(pilkku + 1).trim();

        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate paiva = LocalDate.parse(pvm, muotoilu);

        return new Tapahtuma(nimi, paiva);
    }
}
