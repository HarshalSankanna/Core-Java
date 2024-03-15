public class TowerOfHanoi {
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
        TowerOfHanoi stackA = new TowerOfHanoi();
        TowerOfHanoi stackB = new TowerOfHanoi();
        TowerOfHanoi stackC = new TowerOfHanoi();
        stackA.push(3);
        stackA.push(2);
        stackA.push(1);
        System.out.println("Pass 1");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackA.pop();
        stackC.push(1);
        System.out.println("Pass 2");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackA.pop();
        stackB.push(2);
        System.out.println("Pass 3");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackC.pop();
        stackB.push(1);
        System.out.println("Pass 4");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackA.pop();
        stackC.push(3);
        System.out.println("Pass 5");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackB.pop();
        stackA.push(1);
        System.out.println("Pass 6");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackB.pop();
        stackC.push(2);
        System.out.println("Pass 7");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
        stackA.pop();
        stackC.push(1);
        System.out.println("Pass 8");
        System.out.println("Stack A \t Stack B \t Stack C");
        for (int i = 2; i >= 0; i--) {
            System.out.println(stackA.Stacks[i] + "\t\t" + stackB.Stacks[i] + "\t\t" + stackC.Stacks[i]);
        }
    }
}
