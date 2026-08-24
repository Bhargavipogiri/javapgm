import java.util.Scanner;

public class CircularPrime {

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int pow = 1;

        while (temp > 0) {
            count++;
            pow *= 10;
            temp /= 10;
        }

        pow /= 10;

        boolean result = true;

        for (int i = 0; i < count; i++) {

            if (!isPrime(n)) {
                result = false;
                break;
            }

            n = (n % 10) * pow + n / 10;
        }

        System.out.println(result ? "Circular Prime" : "Not a Circular Prime");

        sc.close();
    }
}