public class Osoba {
    private String meno;
    private int vek;

    public Osoba(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
    }

    public void vypis() {
        System.out.println("Meno: " + meno + ", Vek: " + vek);
    }

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Janko", 25);
        osoba.vypis();
    }
}
