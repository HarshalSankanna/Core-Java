class Vehicle {
    int speed = 170;
}

class Car extends Vehicle {
    int speed = 130;

    void Display() {
        System.out.println("Maximum speed = " + super.speed);
    }
}

public class SuperEx {
    public static void main(String[] args) {
        Car C = new Car();
        C.Display();
    }
}
