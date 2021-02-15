package viikko05.oliot.yhteystieto;

public class NullEsimerkki {

    public static void main(String[] args) {
        Yhteystieto y1 = new Yhteystieto();
        y1.setNimi("Lindsey");
        y1.setEmail("LdrillingCourt0@So-Net.Ne.jp");
        y1.setPuhelin("132-414-7730");

        System.out.println(y1);

        Yhteystieto y2 = new Yhteystieto();
        y2.setNimi("Moses");
        y2.setPuhelin("681-240-4656");

        System.out.println(y2);

        String email = y2.getEmail();

        if (email != null) {
            System.out.println(email.toLowerCase());
        } else {
            System.out.println("Sähköpostiosoite oli null");
        }
    }
}
