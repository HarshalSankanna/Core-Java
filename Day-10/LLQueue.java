import java.util.Scanner;

public class LLQueue {
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
        while (ptr != null) {
            System.out.print(ptr.data + "   ");
            ptr = ptr.next;
        }
    }

    public void delAtStart() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        head = head.next;
        System.out.println("Element Deleted.");
    }

    public static void main(String[] args) {
        LLQueue obj = new LLQueue();
        Scanner sc1 = new Scanner(System.in);
        int ch = 0;
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    obj.append();
                    break;
                case 2:
                    obj.delAtStart();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
