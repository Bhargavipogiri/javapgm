import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int count = 0;

        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total Common Factors: " + count);

        sc.close();
    }
}