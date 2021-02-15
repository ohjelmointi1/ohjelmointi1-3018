package viikko05.oliot.kaupungitV2;

public class KaupunginLuominenJaTulostaminen {

    public static void main(String[] args) {
        Kaupunki hki = new Kaupunki("Helsingfors", 653_867, 214.25);

        Kaupunki esp = new Kaupunki("Espoo", 289_413, 312.32);

        hki.setNimi("Helsinki");
        System.out.println(hki.getNimi());
        System.out.println(hki.laskeVaestontiheys());

        System.out.println(hki);
        System.out.println(esp);
    }
}
