class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class SuperVariableExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}