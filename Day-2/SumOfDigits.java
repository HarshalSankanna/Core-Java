import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != 0) {
            int current = number % 10;
            number = number / 10;
            sum = sum + current;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
