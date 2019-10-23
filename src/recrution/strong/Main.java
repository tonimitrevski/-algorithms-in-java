package recrution.strong;

public class Main {
    public static void main(String[] args) {
        System.out.print(factorial(3));
    }

    private static int factorial(int n) {
        if(n == 0) return 1;

        return n*factorial(n - 1);
    }
}
