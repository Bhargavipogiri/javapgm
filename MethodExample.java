public class MethodExample {

    static int add(int a, int b) {
        return a + b;
    }

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        int sq = square(5);

        System.out.println("Sum = " + sum);
        System.out.println("Square = " + sq);
    }
}