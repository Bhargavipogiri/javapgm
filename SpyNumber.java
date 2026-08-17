import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        System.out.println(sum == product ? 
                "Spy Number" : "Not a Spy Number");

        sc.close();
    }
}