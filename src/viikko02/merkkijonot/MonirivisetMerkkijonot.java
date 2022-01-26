package viikko02.merkkijonot;

public class MonirivisetMerkkijonot {

    public static void main(String[] args) {
        String lista = "maitoa\nleipää\njuustoa\nkahvia";
        System.out.println(lista);

        System.out.println();

        String html = """
                <html>
                    <head>
                        <title>Monirivinen merkkijono</title>
                    </head>
                    <body>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
