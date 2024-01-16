import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of paper 1: ");
        float p1 = sc.nextInt();
        System.out.print("Enter marks of paper 2: ");
        float p2 = sc.nextInt();
        System.out.print("Enter marks of paper 3: ");
        float p3 = sc.nextInt();
        System.out.print("Enter marks of paper 4: ");
        float p4 = sc.nextInt();
        float percentage = (p1 + p2 + p3 + p4) / 4;
        char grade = 'E';
        if (percentage >= 90) {
            grade = 'A';
            System.out.println("Grade: " + grade);
        } else if (percentage >= 80) {
            grade = 'B';
            System.out.println("Grade: " + grade);
        } else if (percentage >= 70) {
            grade = 'C';
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60) {
            grade = 'D';
            System.out.println("Grade: " + grade);
        } else if (percentage >= 40) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Result: Fail");
        }
    }
}
