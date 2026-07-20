import java.util.Scanner;

public class MirrorReflection {

    public static int mirrorReflection(int p, int q) {

        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }

        if (p % 2 == 0 && q % 2 == 1) {
            return 2;
        }

        if (p % 2 == 1 && q % 2 == 1) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p: ");
        int p = sc.nextInt();

        System.out.print("Enter q: ");
        int q = sc.nextInt();

        int result = mirrorReflection(p, q);

        System.out.println("Output: " + result);

        sc.close();
    }
}