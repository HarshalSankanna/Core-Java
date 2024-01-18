import java.util.Scanner;

public class RepeatNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Add elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = true;
                }
            }
        }
        System.out.println(ans);
    }
}
