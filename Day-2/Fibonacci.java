import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int count = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= count; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
