class This3 {
    int a;
    int b;

    This3() {
        this(10, 20);
    }

    This3(int x, int y) {
        a = x;
        b = y;
    }

    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class This2 {
    public static void main(String[] args) {
        This3 t = new This3();
        This3 t1 = new This3(100, 200);
        t.show();
        t1.show();
    }
}
