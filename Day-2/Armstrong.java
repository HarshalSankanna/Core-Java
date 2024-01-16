import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        number = originalNumber;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            sum = (int) (sum + Math.pow((double) rem, (double) count));
        }
        System.out.println(sum);
        if (sum == originalNumber) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }
}
