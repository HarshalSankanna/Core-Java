public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes circle2 = new Circle();
        // Square square = new Square();
        System.out.println("Reference variable is of type Circle");
        circle.greeting();
        circle.area();
        System.out.println();
        System.out.println("Reference variable is of type Shapes");
        circle2.greeting();
        circle2.area();
        // shape.area();
        // circle.area();
        // square.area();

        // System.out.println();

        // Shapes sq = new Square();
        // sq.area();
    }
}
