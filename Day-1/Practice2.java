import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of paper 1: ");
        float p1 = sc.nextInt();
        System.out.print("Enter marks of paper 2: ");
        float p2 = sc.nextInt();
        System.out.print("Enter marks of paper 3: ");
        float p3 = sc.nextInt();
        System.out.print("Enter your gender \"f\" or \"m\": ");
        String gender = sc.next();
        float percentage = (float) ((p1 + p2 + p3) / 3);
        System.out.println(percentage + "%");
        if (percentage >= 62 && gender.equals("m")) {
            System.out.println("You can take admission");
        } else if (percentage >= 92 && gender.equals("f")) {
            System.out.println("You can take admission");
        } else {
            System.out.println("You cannot take admission");
        }
    }
}
