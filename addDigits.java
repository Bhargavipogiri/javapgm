public class AddDigits {
    
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        AddDigits obj = new AddDigits();

        int num = 38;
        System.out.println("Input: " + num);
        System.out.println("Output: " + obj.addDigits(num));
    }
}