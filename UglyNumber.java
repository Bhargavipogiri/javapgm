import java.util.Scanner;

public class UglyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;

        if (n <= 0) {
            System.out.println("Not an Ugly Number");
        } else {
            while (temp % 2 == 0) {
                temp /= 2;
            }

            while (temp % 3 == 0) {
                temp /= 3;
            }

            while (temp % 5 == 0) {
                temp /= 5;
            }

            if (temp == 1)
                System.out.println("Ugly Number");
            else
                System.out.println("Not an Ugly Number");
        }

        sc.close();
    }
}