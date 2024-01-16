import java.util.Arrays;
import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    ans[count] = arr[j];
                    count++;
                    break;
                }
            }

        }
        ans[count] = -1;
        System.out.print(Arrays.toString(ans));
    }
}
