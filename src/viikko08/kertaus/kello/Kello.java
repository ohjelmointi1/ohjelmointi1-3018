package viikko08.kertaus.kello;

public class Kello {

    private int tunnit;
    private int minuutit;

    public Kello(int tunnit, int minuutit) {
        this.setTunnit(tunnit);
        this.setMinuutit(minuutit);
    }

    public void lisaaMinuutit(int mins) {
        if (mins < 0) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.minuutit += mins;

        this.tunnit = (this.tunnit + this.minuutit / 60) % 24;
        this.minuutit = this.minuutit % 60;
    }

    public void setTunnit(int tunnit) {
        if (tunnit < 0 || tunnit >= 24) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.tunnit = tunnit;
    }

    public void setMinuutit(int minuutit) {
        if (minuutit < 0 || minuutit >= 60) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.minuutit = minuutit;
    }

    @Override
    public String toString() {
        if (this.minuutit < 10) {
            return this.tunnit + ":0" + this.minuutit;
        } else {
            return this.tunnit + ":" + this.minuutit;
        }
    }
}
