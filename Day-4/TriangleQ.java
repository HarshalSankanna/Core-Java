class Triangle {
    double a;
    double b;
    double c;

    public Triangle() {
        a = 4;
        b = 5;
        c = 6;
    }

    public double area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt((s) * (s - a) * (s - b) * (s - c));
        return area;
    }

    public double perimeter() {
        return a + b + c;
    }
}

public class TriangleQ {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
    }
}
