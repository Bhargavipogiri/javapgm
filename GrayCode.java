import java.util.*;

public class GrayCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bits: ");
        int n = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            result.add(gray);
        }

        System.out.println("Gray Code: " + result);

        sc.close();
    }
}