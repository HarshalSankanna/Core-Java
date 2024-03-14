import java.util.*;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // insert
        // System.out.print("Enter the number you want to insert: ");
        // int num = sc.nextInt();
        // System.out.print("Enter the position in which you want to insert: ");
        // int pos = sc.nextInt();
        // System.out.println("Array: " + Arrays.toString(arr));
        // for (int i = arr.length - 1; i > pos - 1; i--) {
        // arr[i] = arr[i - 1];
        // }
        // arr[pos - 1] = num;
        // System.out.println("Array: " + Arrays.toString(arr));

        // delete
        System.out.print("Enter the position from which you want to delete: ");
        int pos = sc.nextInt();
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = 0;
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
