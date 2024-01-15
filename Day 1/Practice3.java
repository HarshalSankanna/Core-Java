import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day (ex: mon, tue, thur, etc): ");
        String day = sc.nextLine();
        if (day.equals("sat") || day.equals("sun")) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("It is a weekday");
        }
    }
}
