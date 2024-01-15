import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four number: ");
        int number = sc.nextInt();
        int numberOne = number % 10;
        int numberCurrent = number / 10;
        int numberTwo = numberCurrent % 10;
        int numberCurrent2 = numberCurrent / 10;
        int numberThree = numberCurrent2 % 10;
        int numberFour = numberCurrent2 / 10;
        System.out
                .println("Reverse string: " + (numberOne * 1000 + numberTwo * 100 + numberThree * 10 + numberFour * 1));
    }
}
