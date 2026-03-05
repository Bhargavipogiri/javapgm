class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void show() { }  
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}