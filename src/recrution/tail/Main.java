package recrution.tail;

public class Main {
    public static void main(String[] args) {
        System.out.print(factorial(3, 1));
    }

    private static int factorial(int n, int result) {
        if(n == 0) return 1;

        return n*factorial(n - 1, n*result);
    }
}
