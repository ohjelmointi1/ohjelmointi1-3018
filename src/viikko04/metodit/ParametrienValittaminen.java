package viikko04.metodit;

public class ParametrienValittaminen {

    public static void main(String[] args) {
        String otsikko1 = "Metodit";
        tulostaOtsikko(otsikko1);

        String otsikko2 = "Ajan käsitteleminen";
        tulostaOtsikko(otsikko2);

        String otsikko3 = "Olio-ohjelmointi";
        tulostaOtsikko(otsikko3);

        tulostaOtsikko("Poikkeukset");
    }

    public static void tulostaOtsikko(String otsikko) {
        System.out.println("<h1>" + otsikko + "</h1>");
    }
}
