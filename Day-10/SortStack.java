public class SortStack {
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

    public int peek() {
        if (!isEmpty()) {
            return Stacks[TOP];
        } else {
            System.out.println("The Stack is empty");
        }
        return 0;
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
        SortStack ogStack = new SortStack();
        SortStack tmpStack = new SortStack();

        ogStack.push(34);
        ogStack.push(3);
        ogStack.push(31);
        ogStack.push(98);
        ogStack.push(92);
        ogStack.push(23);

        int temp = 0;
        int element = 0;

        System.out.println("Original Stack:");
        ogStack.traverse();
        System.out.println("Temp Stack:");
        tmpStack.traverse();

        while (!ogStack.isEmpty()) {
            element = ogStack.pop();
            while (!tmpStack.isEmpty() && element < tmpStack.peek()) {
                temp = tmpStack.pop();
                ogStack.push(temp);
            }
            tmpStack.push(element);
            System.out.println("\nOutput of this step is: ");
            System.out.println("Original Stack:");
            ogStack.traverse();
            System.out.println("Temp Stack:");
            tmpStack.traverse();

        }
        System.out.println("\nFinal Sorted Stack:");
        tmpStack.traverse();
    }
}
