import java.util.Scanner;

public class EvilNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int temp = n;

        while (temp > 0) {
            count += temp & 1;
            temp >>= 1;
        }

        if (count % 2 == 0)
            System.out.println("Evil Number");
        else
            System.out.println("Not an Evil Number");

        sc.close();
    }
}