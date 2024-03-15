public class WaterJug {
    final int CAPACITY = 5;
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
            // System.out.println("Pushed: " + n);
        } else {
            System.out.println("The Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            // int res = Stacks[TOP];
            Stacks[TOP] = 0;
            TOP--;
            // System.out.println("Popped: " + res);
        } else {
            System.out.println("The Stack is empty, cannot pop");
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
        WaterJug ltr5Jug = new WaterJug();
        WaterJug ltr3Jug = new WaterJug();

        for (int i = 0; i < 5; i++) {
            ltr5Jug.push(1);
        }

        for (int i = 0; i < 3; i++) {
            ltr5Jug.pop();
            ltr3Jug.push(1);
            ltr3Jug.pop();
        }

        for (int i = 0; i < 2; i++) {
            ltr5Jug.pop();
            ltr3Jug.push(1);
        }

        for (int i = 0; i < 5; i++) {
            ltr5Jug.push(1);
        }

        ltr5Jug.pop();
        ltr3Jug.push(1);

        ltr5Jug.traverse();
    }
}