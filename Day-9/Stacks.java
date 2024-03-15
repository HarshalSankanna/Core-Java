import java.util.*;

public class Stacks {
    final int CAPACITY = 10;
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
            System.out.println("Pushed: " + n);
        } else {
            System.out.println("The Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int res = Stacks[TOP];
            Stacks[TOP] = 0;
            TOP--;
            System.out.println("Popped: " + res);
        } else {
            System.out.println("The Stack is empty, cannot pop");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(Stacks[TOP]);
        } else {
            System.out.println("The Stack is empty");
        }
    }

    public void traverse() {
        if (!isEmpty()) {
            for (int i = TOP; i >= 0; i--) {
                System.out.println(Stacks[i]);
            }
        } else {
            System.out.println("The Stack is empty");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks stack = new Stacks();
        int ch = 0;
        while (true) {
            System.out.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Select any option: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.traverse();
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
