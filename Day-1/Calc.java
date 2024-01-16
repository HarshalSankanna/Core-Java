import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+, -, /, *, %): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        double b = sc.nextDouble();
        double result = 0;
        boolean isOk = true;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b == 0) {
                    isOk = false;
                    System.out.println("Infinity");
                    break;
                }
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                isOk = false;
                System.out.println("Enter valid expression");
                break;
        }
        if (isOk) {
            System.out.println("= " + result);
        }
    }
}