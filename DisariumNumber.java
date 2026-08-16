import java.util.Scanner;

public class DisariumNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            digits--;
            temp /= 10;
        }

        System.out.println(sum == n ? "Disarium Number" : "Not a Disarium Number");

        sc.close();
    }
}