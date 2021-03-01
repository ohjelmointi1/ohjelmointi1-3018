package viikko06.jarjestaminen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JarjestyksenVertailu {

    public static void main(String[] args) {
        List<String> maakunnat = new ArrayList<>();
        maakunnat.add("Uusimaa");
        maakunnat.add("Pirkanmaa");
        maakunnat.add("Lappi");
        maakunnat.add("Etelä-Savo");
        maakunnat.add("kymenlaakso");
        System.out.println("Alkuperäinen: " + maakunnat);

        Collections.sort(maakunnat, String::compareToIgnoreCase);

        System.out.println("Sortattu: " + maakunnat);

        String mjono1 = "Uusimaa";
        String mjono2 = "Etelä-Savo";

        System.out.println(mjono1.compareTo(mjono2));

        System.out.println("apple".compareTo("xerox"));
        System.out.println("windows".compareTo("bitcoin"));
        System.out.println("tesla".compareTo("tesla"));

        System.out.println("X".compareToIgnoreCase("a"));
    }
}
