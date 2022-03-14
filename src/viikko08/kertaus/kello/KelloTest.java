package viikko08.kertaus.kello;

public class KelloTest {

    public static void main(String[] args) {

        Kello kello = new Kello(0, 0);
        System.out.println(kello);

        kello.lisaaMinuutit(140);
        System.out.println(kello);

        kello.lisaaMinuutit(29);
        System.out.println(kello);

        kello.lisaaMinuutit(45);
        System.out.println(kello);

        try {
            kello = new Kello(-1, 0);
            System.out.println(kello);
        } catch (IllegalArgumentException virhe) {
            System.out.println("Kellon luominen virheellisellä ajalla epäonnistui");
        }
        System.out.println("Ohjelma loppuu (eli ei kaatunut)");
    }
}
