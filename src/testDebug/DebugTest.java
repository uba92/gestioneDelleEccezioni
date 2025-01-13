package testDebug;

public class DebugTest {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int somma = somma(a, b);
        System.out.println("La somma è: " + somma);

        int sub = sub(a,b);
        System.out.println("La differenza è: " + sub);

        a = quadrato(a);
        System.out.println("il quadrato è: " + a);
    }

    public static int somma(int x, int y) {
        return x+y;
    }

    public static int sub(int x, int y) {
        return x-y;
    }

    public static int quadrato(int x) {
        return x*x;
    }
}
