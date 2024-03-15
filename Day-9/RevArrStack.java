import java.util.Arrays;
import java.util.Scanner;

public class RevArrStack {
    final int CAPACITY = 100;
    int TOP = -1;
    int[] Stacks = new int[CAPACITY];

    public boolean isFull() {
        if (TOP >= CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (TOP == -1) {
            return true;
        }
        return false;
    }

    public void push(int n) {
        if (!isFull()) {
            TOP++;
            Stacks[TOP] = n;
        } else {
            System.out.println("The Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int res = Stacks[TOP];
            Stacks[TOP] = 0;
            TOP--;
            return res;
        } else {
            System.out.println("The Stack is empty, cannot pop");
        }
        return 0;
    }

    public static void main(String[] args) {
        RevArrStack stack = new RevArrStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
