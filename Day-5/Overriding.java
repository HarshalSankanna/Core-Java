class Parent {
    public void vehicle() {
        System.out.println("Splendor+");
    }
}

class Child extends Parent {
    public void vehicle() {
        System.out.println("Mercedes");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Child H = new Child();
        H.vehicle();
    }
}
