import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfFour(n)) {
            System.out.println(n + " is a Power of Four.");
        } else {
            System.out.println(n + " is NOT a Power of Four.");
        }

        sc.close();
    }
}