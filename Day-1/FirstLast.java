import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int numberOne = number % 10;
        int numberTwo = number / 10000;
        System.out.println(numberOne + numberTwo);
    }
}
