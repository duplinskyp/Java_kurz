public class VynimkyAChyboveHlasenia {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Chyba: Delenie nulou");
        }
    }
}
