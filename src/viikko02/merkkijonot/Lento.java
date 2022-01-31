package viikko02.merkkijonot;

public class Lento {

    public static void main(String[] args) {
        String lento = "AY905";
        String yhtio = lento.substring(0, 2);
        String numero = lento.substring(2, 3);

        if (yhtio.startsWith("AY")) {
            if (numero.equals("1")) {
                System.out.println("Kaukolento");

            } else if (numero.equals("7")) {
                System.out.println("Venäjän lento");

            } else if ("23456".contains(numero)) {
                System.out.println("Kotimaan lento");

            } else {
                // "nice to know": System.err tulostaa punaisella :D
                System.err.println("Tuntematon lento!!!");
            }
        } else {
            System.out.println("Ei ole Finnairin lento");
        }
    }
}
