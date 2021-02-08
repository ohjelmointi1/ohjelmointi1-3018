package viikko04.metodit;

public class Pyoristykset {
    public static int pyoristaLahimpaanVitoseen(int luku) {
        int jakojaannos = luku % 5;
        if (jakojaannos > 2) {
            return luku + 5 - jakojaannos;
        } else {
            return luku - jakojaannos;
        }
    }
}
