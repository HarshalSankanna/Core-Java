import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int n3 = sc.nextInt();
        System.out.print("Enter number4: ");
        int n4 = sc.nextInt();
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        if (n4 < min) {
            min = n4;
        }

        System.out.println("The min number is: " + min);
    }
}
