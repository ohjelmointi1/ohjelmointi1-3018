package viikko05.oliot.henkilotiedot;

public class HenkilotietoOhjelma {

    public static void main(String[] args) {

        Henkilotieto aiti = new Henkilotieto("Cecilia Smith", 1, 6, 1975);

        Henkilotieto adam = new Henkilotieto("Adam Smith", 2, 3, 2000);
        Henkilotieto bob = new Henkilotieto("Bob Smith", 4, 5, 2003);

        aiti.lisaaLapsi(adam);
        aiti.lisaaLapsi(bob);

        System.out.println(aiti);
        System.out.println();
        System.out.println(adam);
        System.out.println();
        System.out.println(bob);

        // esimerkki metodista, joka kutsuu sisäisesti toista metodia (laskeIka)
        if (bob.onTaysiIkainen()) {
            System.out.println("Bob on täysi-ikäinen");
        } else {
            System.out.println("Bob ei ole täysi-ikäinen");
        }
    }
}
