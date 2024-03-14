import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int loc, temp;
        for (int i = 1; i < n - 1; i++) {
            temp = arr[i];
            loc = i - 1;
            while (loc >= 0 && arr[loc] > temp) {
                arr[loc + 1] = arr[loc];
                loc--;
            }
            arr[loc + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
