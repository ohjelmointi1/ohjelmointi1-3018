package viikko03.listat;

import java.util.List;
import java.util.Random;

public class ListanLuominenValmiillaArvoilla {

    public static void main(String[] args) {
        Random random = new Random();

        List<String> varit = List.of("punainen", "sininen", "ruskea");
        List<String> luonteet = List.of("ahkera", "huumorintajuinen");
        List<String> lajit = List.of("kirahvi", "laiskiainen", "leijona", "koira");

        int satunnainenVari = random.nextInt(varit.size());
        String vari = varit.get(satunnainenVari);

        int satunnainenLuonne = random.nextInt(luonteet.size());
        String luonne = luonteet.get(satunnainenLuonne);

        int satunnainenLaji = random.nextInt(lajit.size());
        String laji = lajit.get(satunnainenLaji);

        String hahmonNimi = vari + " " + luonne + " " + laji;
        System.out.println(hahmonNimi);
    }
}
