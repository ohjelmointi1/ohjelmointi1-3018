package viikko02.merkkijonot;

public class MerkkijonojenMetodit {

    public static void main(String[] args) {
        String osoite = "https://ohjelmointi1.github.io/";
        boolean onSuojattu = osoite.startsWith("https://");
        System.out.println("Suojattu: " + onSuojattu); // true

        String kurssikoodi = "swd4tn032-3099";
        int valiviiva = kurssikoodi.indexOf("-");
        String opintojakso = kurssikoodi.substring(0, valiviiva);

        System.out.println("Opintojakso: " + opintojakso.toUpperCase()); // "SWD4TN032"

        String toteutusnumero = kurssikoodi.substring(valiviiva + 1); // "3099"
        System.out.println("Toteutusnumero: " + toteutusnumero);

        boolean ohjelmistotuotanto = kurssikoodi.toLowerCase().contains("swd");
        System.out.println("Ohjelmistotuotanto: " + ohjelmistotuotanto);

        System.out.println("C:\\Users\\Minä\\Documents\\");
    }
}
