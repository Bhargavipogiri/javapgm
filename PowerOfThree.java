import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of 3.");
        } else {
            System.out.println(n + " is not a power of 3.");
        }

        sc.close();
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
}