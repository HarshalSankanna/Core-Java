import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int start = 0;
        int end = n - 1;
        boolean flag = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                index = mid;
                flag = true;
                break;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (flag) {
            System.out.println("The key was found at: " + index);
        } else {
            System.out.println("The key was not found");
        }
    }
}
