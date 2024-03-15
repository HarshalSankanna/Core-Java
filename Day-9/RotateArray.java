import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int steps = 2;
        int front = arr.length - 1;
        int temp = 0;
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for (int j = front; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[j - 1];
            arr[0] = temp;
            count++;
            if (count == steps) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        // wrong solution
    }
}
