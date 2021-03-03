package viikko06.poikkeukset;

import viikko05.oliot.henkilotiedot.Henkilotieto;

public class PoikkeuksenHeittaminen {

    public static void main(String[] args) {

        try {
            // Henkilotieto-luokka heittää poikkeuksen, jos päivämäärä on tulevaisuudessa
            Henkilotieto henkilo = new Henkilotieto("John", 1, 2, 2100);

            // .. 1000 riviä

            System.out.println(henkilo);

        } catch (IllegalArgumentException poikkeus) {
            System.out.println(poikkeus.getMessage());

        }
    }
}
