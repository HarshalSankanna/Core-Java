import java.util.Scanner;

public class Shambhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter digits: ");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + "-" + (char) arr[i] + " ");
        }
    }
}
