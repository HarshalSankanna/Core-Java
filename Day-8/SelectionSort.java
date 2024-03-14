import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min, loc;
        for (int i = 0; i < n - 1; i++) {
            min = arr[i];
            loc = i;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    loc = j;
                }
            }
            if (loc != i) {
                int temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
