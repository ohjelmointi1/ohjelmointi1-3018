package viikko08.kertaus;

public class Matematiikka {

    public static void main(String[] args) {
        System.out.println("Pii: " + Math.PI);
        System.out.println("Kolme potenssiin kaksi: " + Math.pow(3, 2));
        System.out.println("Kolme potenssiin kaksi: " + (3 * 3));

        double sade = 12.3;
        System.out.println("Ympyrän pinta-ala (PI * sade^2): " + (Math.PI * Math.pow(sade, 2)));

        double ympyranAla = 600.0;
        // neliöjuuri: Math.sqrt
        System.out.println("Kun ala on " + ympyranAla + ", säde on " + Math.sqrt(ympyranAla / Math.PI));
    }
}
