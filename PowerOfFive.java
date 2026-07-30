import java.util.Scanner;

public class PowerOfFive {

    public static boolean isPowerOfFive(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfFive(n)) {
            System.out.println(n + " is a power of 5.");
        } else {
            System.out.println(n + " is not a power of 5.");
        }

        sc.close();
    }
}