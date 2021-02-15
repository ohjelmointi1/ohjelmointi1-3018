package viikko05.oliot.kaupungitV1;

public class KaupunkiOhjelma {

    public static void main(String[] args) {
        Kaupunki hki = new Kaupunki();
        hki.nimi = "Helsinki";
        hki.vakiluku = 653_867;
        hki.pintaAla = 214.25;

        Kaupunki esp = new Kaupunki();
        esp.nimi = "Espoo";
        esp.vakiluku = 289_413;
        esp.pintaAla = 312.32;

        System.out.println(hki.nimi);
        System.out.println(hki.vakiluku);
        System.out.println("Helsingin väestöntiheys " + hki.laskeVaestontiheys());

        System.out.println(esp.nimi);
        System.out.println(esp.vakiluku);
        System.out.println("Espoon väestöntiheys " + esp.laskeVaestontiheys());

        if (hki.vakilukuSuurempiKuin(esp)) {
            System.out.println("Helsingin väkiluku on suurempi");
        } else {
            System.out.println("Espoon väkiluku on suurempi");
        }
    }
}
