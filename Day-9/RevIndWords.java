public class RevIndWords {
    final int CAPACITY = 100;
    int TOP = -1;
    char[] Stacks = new char[CAPACITY];

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

    public void push(char n) {
        if (!isFull()) {
            TOP++;
            Stacks[TOP] = n;
        } else {
            System.out.println("The Stack is full");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char res = Stacks[TOP];
            Stacks[TOP] = 0;
            TOP--;
            return res;
        } else {
            System.out.println("The Stack is empty, cannot pop");
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "Hello world ashish sir";
        RevIndWords s = new RevIndWords();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (!s.isEmpty()) {
                    ans = ans + s.pop();
                }
                ans = ans + " ";
            } else {
                s.push(str.charAt(i));
            }
        }

        while (!s.isEmpty()) {
            ans = ans + s.pop();
        }

        System.out.println(ans);
    }

}
