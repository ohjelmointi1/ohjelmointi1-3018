package viikko07.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class KalenterinLukeminen {

    public static void main(String[] args) throws IOException {
        Path tiedostoPolku = Paths.get("juhlapyhat.csv");

        List<String> rivit = Files.readAllLines(tiedostoPolku, StandardCharsets.UTF_8);

        System.out.println(rivit.size());

        for (String rivi : rivit) {
            System.out.println(rivi);
        }
    }
}
