package viikko06.vertailu;

public class Vertailu {

    public static void main(String[] args) {
        String merkkijono1 = new String("hauki");
        String merkkijono2 = new String("hauki");

        System.out.println("Vertailu: " + (merkkijono1 == merkkijono2));
        System.out.println("Vertailu equals: " + merkkijono1.equals(merkkijono2));
    }
}
