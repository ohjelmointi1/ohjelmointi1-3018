package viikko05.ruokakauppa;

public class KauppaOhjelma {

    public static void main(String[] args) {

        Tuote juustoviipaleet = new Tuote();
        juustoviipaleet.nimi = "Juustoviipaleet";
        juustoviipaleet.hinta = 3.59;
        juustoviipaleet.paino = 0.5;

        Tuote juustokimpale = new Tuote();
        juustokimpale.nimi = "Kermajuusto";
        juustokimpale.hinta = 6.39;
        juustokimpale.paino = 1.0;

        Tuote homejuusto = new Tuote();
        homejuusto.nimi = "Homejuusto pala";
        homejuusto.hinta = 2.89;
        homejuusto.paino = 0.17;

        // Tulostetaan tuotteiden tiedot:
        // (Java kutsuu toString-metodia taustalla)
        System.out.println(juustoviipaleet);
        System.out.println(juustokimpale);
        System.out.println(homejuusto);

        if (juustokimpale.onHalvempiKilohinta(homejuusto)) {
            System.out.println(juustokimpale.nimi + " on halvempi kuin " + homejuusto.nimi);
        }
    }
}
