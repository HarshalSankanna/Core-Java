import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");
        } else if (ch > 48 && ch <= 58) {
            System.out.println("Digit");
        } else {
            System.out.println("Symbol");
        }
    }
}
