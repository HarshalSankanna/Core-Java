import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        boolean isVowel = true;
        switch (ch) {
            case 'a':
                break;
            case 'e':
                break;
            case 'i':
                break;
            case 'o':
                break;
            case 'u':
                break;
            default:
                isVowel = false;
                System.out.println("Given character is not a Vowel");
                break;
        }
        if (isVowel) {
            System.out.println("Given character is a Vowel");
        }
    }
}
