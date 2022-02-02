package viikko02.toisto;

/**
 * Älä kopioi tätä ratkaisua! Saat käyttää ratkaisua mallina oppiaksesi ja
 * toteuttaaksesi itse samankaltaisen ratkaisun.
 */
public class Alkuluku {

    public static void main(String[] args) {
        // Luku 93 ei ole alkuluku.
        // Luku 97 on alkuluku.
        long luku = 87_178_291_199L;
        boolean onAlkuluku = true;

        for (long jakaja = 2; jakaja <= Math.sqrt(luku); jakaja++) {
            if (luku % jakaja == 0) {
                onAlkuluku = false;
                break;
            }
        }

        if (onAlkuluku) {
            System.out.println("Luku " + luku + " on alkuluku.");
        } else {
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }
    }
}
