import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;
        while (number > 1 && number != 0) {
            factorial = number * factorial;
            number--;
        }
        System.out.println("Factorial is " + factorial);
    }
}
