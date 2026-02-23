class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Cars {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Toyota";
        c1.year = 2022;

        c2.brand = "Honda";
        c2.year = 2021;

        c1.display();
        c2.display();
    }
}