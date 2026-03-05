final class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// class Car extends Vehicle { } // Error: Cannot inherit from final class

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}