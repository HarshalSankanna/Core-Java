import java.util.Scanner;

class Rectangle {
    int l, b;

    public Rectangle(int l1, int b1) {
        l = l1;
        b = b1;
    }

    public int area() {
        return l * b;
    }
}

public class RectangleQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        System.out.println("Area: " + r.area());
    }
}
