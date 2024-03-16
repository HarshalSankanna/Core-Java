import java.util.Scanner;

public class LLStack {
    class GetNode {
        int data;
        GetNode next;

        GetNode() {
            next = null;
        }
    }

    GetNode head = null;

    Scanner sc = new Scanner(System.in);

    public void append() {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            System.out.println(data + " is added");
        } else {
            GetNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            System.out.println(data + " is added");
        }
    }

    public void traverse() {
        GetNode ptr = head;
        int arr[] = new int[100];
        int i = 0;
        while (ptr != null) {
            arr[i] = ptr.data;
            i++;
            ptr = ptr.next;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }

    public void delAtEnd() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Popped.");
            return;
        }
        GetNode ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        System.out.println("Popped.");
    }

    public void peek() {
        GetNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        System.out.println(ptr.data);
    }

    public static void main(String[] args) {
        LLStack obj = new LLStack();
        Scanner sc1 = new Scanner(System.in);
        int ch = 0;
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Traverse");
            System.out.println("4. Peek");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice: ");
            ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    obj.append();
                    break;
                case 2:
                    obj.delAtEnd();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
