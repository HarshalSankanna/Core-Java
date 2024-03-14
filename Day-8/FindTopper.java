import java.util.Arrays;
import java.util.Scanner;

public class FindTopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        System.out.println("Enter percentages of students: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sortArr[] = selSort(arr);
        System.out.println(Arrays.toString(sortArr));
        System.out.println("Topper's percentage using selection sort: " + sortArr[n - 1]);
        int binaryKey = sortArr[n - 1];
        System.out.println("Topper's percentage found at using binary search: " + binarySearch(sortArr, binaryKey));
    }

    public static int[] selSort(int arr[]) {
        int min, loc;
        int n = arr.length;
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
        return arr;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                index = mid;
                return index;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
