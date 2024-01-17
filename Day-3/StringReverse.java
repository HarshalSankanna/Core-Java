import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char string[] = new char[str.length()];
        for (int i = 0; i < string.length; i++) {
            string[i] = str.charAt(i);
        }
        str = "";
        System.out.print("Reverse string: ");
        for (int i = string.length - 1; i >= 0; i--) {
            str = str + string[i];
        }
        System.out.print(str);

    }
}
