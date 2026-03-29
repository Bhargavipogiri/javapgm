class ThrowsDemo {
    static void check() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String args[]) {
        try {
            check();
        } catch(ArithmeticException e) {
            System.out.println("Handled in main");
        }
    }
}