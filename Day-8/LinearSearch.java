import java.util.Scanner;

public class LinearSearch {
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
        boolean flag = false;
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                index = i;
                flag = true;
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("The key was found at: " + index);
        } else {
            System.out.println("Key was not found");
        }
    }
}
