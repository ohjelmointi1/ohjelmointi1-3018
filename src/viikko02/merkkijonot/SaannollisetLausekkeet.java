package viikko02.merkkijonot;

public class SaannollisetLausekkeet {

    public static void main(String[] args) {
        String haagaHelia = "Haaga-Helia avaa ovet työelämään.".replaceAll("\\.", "!");
        System.out.println(haagaHelia);

        String oikeaEmail = "tunnus@myy.haaga-helia.fi";
        String vaaraEmail = "tunnus@myy@haaga-helia.fi";

        // https://stackoverflow.com/a/201447
        String emailRegex = "^[^\\s@]+@([^\\s@.,]+\\.)+[^\\s@.,]{2,}$";

        System.out.println(oikeaEmail.matches(emailRegex));
        System.out.println(vaaraEmail.matches(emailRegex));
    }
}
