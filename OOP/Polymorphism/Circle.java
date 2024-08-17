public class Circle extends Shapes {

    @Override
    void area() {
        System.out.println("Area is pie into r square");
    }

    static void greeting() {
        System.out.println("Greetings from the Circle class");
    }

    // Gives error as normal method cannot override static method
    // void greeting() {
    // System.out.println("Greetings from the Circle class");
    // }
}
