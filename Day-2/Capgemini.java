import java.util.Scanner;

public class Capgemini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of semester: ");
        int semsters = sc.nextInt();
        int semNo;
        int subjects[] = new int[semsters];
        int marks[] = new int[10];
        int max;
        int maxMarks[] = new int[semsters];
        for (int i = 0; i < semsters; i++) {
            semNo = i + 1;
            System.out.print("Enter number of subjects in semester " + semNo + ": ");
            subjects[i] = sc.nextInt();
        }
        semNo = 0;

        for (int i = 0; i < semsters; i++) {
            semNo = i + 1;
            System.out.println("Marks obtained in semseter " + semNo + ": ");
            for (int j = 0; j < subjects[i]; j++) {
                marks[j] = sc.nextInt();
                if (marks[j] > 100 || marks[j] < 0) {
                    System.out.println("You have entered invalid marks");
                    j--;
                    continue;
                }

            }
            max = marks[0];
            for (int j = 0; j < subjects[i]; j++) {
                if (marks[j] > marks[0]) {
                    max = marks[j];
                }
                maxMarks[i] = max;
            }
        }
        int semNo2;
        for (int i = 0; i < semsters; i++) {
            semNo2 = i + 1;
            System.out.println("Max marks in sem " + semNo2 + ": " + maxMarks[i]);
        }
    }
}
