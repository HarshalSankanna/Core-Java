import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int lastDigit = number % 10;
        int firstDigit = number / 10;
        System.out.println(lastDigit + firstDigit);
    }
}