import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println("The year is a non century leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            if (year % 400 == 0) {
                System.out.println("The year is a century leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
    }
}
