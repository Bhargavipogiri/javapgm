class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class Vote {
    public static void main(String args[]) {
        int age = 16;

        try {
            if(age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}