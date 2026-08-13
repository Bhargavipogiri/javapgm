import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a Perfect Number");
            return;
        }

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        if (sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        sc.close();
    }
}