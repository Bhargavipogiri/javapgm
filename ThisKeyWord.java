class ThisKeyWord {

    void show() {
        System.out.println("Hello");
    }

    void display() {
        this.show();   // calling current class method
    }

    public static void main(String[] args) {
        ThisKeyWord obj = new ThisKeyWord();
        obj.display();
    }
}