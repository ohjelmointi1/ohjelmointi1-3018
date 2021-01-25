package viikko02.toisto;

import java.text.DecimalFormat;

public class HinnanValintaHTML {

    public static void main(String[] args) {

        // alustus
        int hinta = 0;

        System.out.println("<select name=\"min\">");
        System.out.println("    <option>Minimi</option>");

        DecimalFormat hintaMuotoilu = new DecimalFormat("#,###");

        // toistoehto
        while (hinta <= 5_000) {
            String muotoiltu = hintaMuotoilu.format(hinta);
            System.out.println("    <option value=\"" + hinta + "\">" + muotoiltu + " €</option>");

            // kasvatus
            if (hinta < 3_000) {
                hinta += 500;
            } else {
                hinta += 1000;
            }
        }
        System.out.println("</select>");
    }

}
