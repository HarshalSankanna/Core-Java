import java.util.Scanner;

public class Queues {
    final int CAPACITY = 10;
    int rear = -1;
    int front = 0;
    int queue[] = new int[CAPACITY];

    public boolean isFull() {
        if (rear >= CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    public void insert(int n) {
        if (!isFull()) {
            rear++;
            queue[rear] = n;
            System.out.println("Value inserted: " + n);
        } else {
            System.out.println("The queue is full");
        }
    }

    public void delete() {

        if (!isEmpty()) {
            int del = queue[0];
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            System.out.println("Value deleted: " + del);
        } else {
            System.out.println("The queue is empty");
        }
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < rear + 1; i++) {
            System.out.print(queue[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queues q = new Queues();
        int ch = 0;
        while (true) {
            System.out.println();
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Select any option: ");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    q.insert(val);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
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
