import java.util.Scanner;

public class KaprekarNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long square = (long) n * n;
        int digits = String.valueOf(n).length();
        long divisor = (long) Math.pow(10, digits);

        long left = square / divisor;
        long right = square % divisor;

        if (left + right == n)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");

        sc.close();
    }
}