import java.util.Scanner;

public class LongestCommonSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        if (maxLength > 0) {
            String result = s1.substring(endIndex - maxLength, endIndex);
            System.out.println("Longest Common Substring: " + result);
        } else {
            System.out.println("No Common Substring Found");
        }

        System.out.println("Length: " + maxLength);

        sc.close();
    }
}