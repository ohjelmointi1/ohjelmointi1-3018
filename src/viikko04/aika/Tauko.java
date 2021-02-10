package viikko04.aika;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tauko {

    public static void main(String[] args) {
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("h:mm");

        if (args.length == 0) {
            System.out.println("Anna tauon pituus parametrina!");
        } else {
            int minuutit = Integer.parseInt(args[0]);
            LocalTime taukoLoppuu = LocalTime.now().plusMinutes(minuutit);

            System.out.println("Tauko päättyy " + taukoLoppuu.format(muotoilu));
        }
    }
}
