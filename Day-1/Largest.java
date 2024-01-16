import java.util.Scanner;

public class Largest {
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
        System.out.print("Enter number5: ");
        int n5 = sc.nextInt();
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        if (n5 > max) {
            max = n5;
        }
        System.out.println("The max number is: " + max);
    }
}
