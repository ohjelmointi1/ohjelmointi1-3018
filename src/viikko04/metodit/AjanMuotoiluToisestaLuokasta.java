package viikko04.metodit;

import java.time.LocalDate;

public class AjanMuotoiluToisestaLuokasta {

    public static void main(String[] args) {
        LocalDate huominen = LocalDate.now().plusDays(1);
        String huominenMerkkijonona = PaivanMuotoilu.muotoilePaivamaara(huominen);

        System.out.println("Huomenna on " + huominenMerkkijonona);
    }
}
