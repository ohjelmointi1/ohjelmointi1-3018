package viikko02.toisto;

import java.time.Year;

public class VuosiluvunValintaHTML {

    public static void main(String[] args) {
        Year nykyinenVuosi = Year.now();
        int vuosiluku = nykyinenVuosi.getValue();

        System.out.println("<select name=\"min\">");
        System.out.println("    <option>Minimi</option>");

        for (int vuosi = vuosiluku + 1; vuosi >= 1886; vuosi--) {
            System.out.println("    <option value=\"" + vuosi + "\">" + vuosi + "</option>");
        }

        System.out.println("</select>");
    }
}
