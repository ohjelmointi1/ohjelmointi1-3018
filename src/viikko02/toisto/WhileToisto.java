package viikko02.toisto;

public class WhileToisto {

    public static void main(String[] args) {

        // alustus:
        int ika = 16;

        // toistoehto:
        while (ika < 18) {
            System.out.println("Ikä: " + ika + ". Et pääse vielä kasinolle");

            // kasvatus:
            ika++; // kasvattaa arvoa yhdellä
        }

        System.out.println("Ikä lopussa: " + ika);
    }
}
