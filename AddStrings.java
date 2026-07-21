public class AddStrings {

    public static String addStrings(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int sum = n1 + n2;

        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        System.out.println(addStrings(num1, num2));
    }
}