import java.util.Scanner;

public class LinkedLists {

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
            System.out.print(ptr.data + "--->");
            ptr = ptr.next;
        }
    }

    public void addAfter() {
        System.out.print("Enter element after you want to add data: ");
        int after = sc.nextInt();
        System.out.print("Enter data: ");
        int data = sc.nextInt();

        GetNode newNode = new GetNode();
        newNode.data = data;

        GetNode ptr = head;
        while (ptr != null) {
            if (ptr.data == after) {
                newNode.next = ptr.next;
                ptr.next = newNode;
                System.out.println(data + " is added after " + after);
                break;
            }
            ptr = ptr.next;
        }
        if (ptr == null) {
            System.out.println(after + " not found in the list.");
        }
    }

    public void addAtStart() {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        System.out.println(data + " is added at the start.");
    }

    public void delAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Last node deleted.");
            return;
        }
        GetNode ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        System.out.println("Last node deleted.");
    }

    public void delAnywhere() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Enter data to delete: ");
        int data = sc.nextInt();
        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted.");
            return;
        }
        GetNode ptr = head;
        while (ptr.next != null) {
            if (ptr.next.data == data) {
                ptr.next = ptr.next.next;
                System.out.println(data + " deleted.");
                return;
            }
            ptr = ptr.next;
        }
        System.out.println(data + " not found in the list.");
    }

    public void delAtStart() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        System.out.println("First node deleted.");
    }

    public static void main(String[] args) {
        LinkedLists obj = new LinkedLists();
        Scanner sc1 = new Scanner(System.in);
        int ch = 0;
        while (true) {
            System.out.println("\n1. Append at end");
            System.out.println("2. Add after");
            System.out.println("3. Add at start");
            System.out.println("4. Delete at end");
            System.out.println("5. Delete anywhere");
            System.out.println("6. Delete at start");
            System.out.println("7. Traverse");
            System.out.println("8. Exit\n");
            System.out.print("Enter your choice: ");
            ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    obj.append();
                    break;
                case 2:
                    obj.addAfter();
                    break;
                case 3:
                    obj.addAtStart();
                    break;
                case 4:
                    obj.delAtEnd();
                    break;
                case 5:
                    obj.delAnywhere();
                    break;
                case 6:
                    obj.delAtStart();
                    break;
                case 7:
                    obj.traverse();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
