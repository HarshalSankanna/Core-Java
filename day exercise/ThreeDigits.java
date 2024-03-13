import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int numberOne = number % 10;
        int numberCurrent = number / 10;
        int numberTwo = numberCurrent % 10;
        int numberThree = numberCurrent / 10;
        System.out.println(numberOne + numberTwo + numberThree);
    }
}
