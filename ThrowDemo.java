class ThrowDemo {
    public static void main(String args[]) {
        int age = 16;

        try {
            if(age < 18) {
                throw new ArithmeticException("Underage");
            } else {
                System.out.println("Allowed");
            }
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}