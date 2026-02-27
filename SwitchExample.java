import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}