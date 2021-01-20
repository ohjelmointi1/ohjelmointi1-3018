package viikko01.ehtorakenteet;

public class ArvojenVertailu {

    public static void main(String[] args) {
        int ika = 18;

        boolean taysiIkainen = ika >= 18;
        boolean lapsi = ika <= 12;
        boolean elakelainen = ika >= 65;

        System.out.println(taysiIkainen);
        System.out.println(lapsi);
        System.out.println(elakelainen);
    }
}
