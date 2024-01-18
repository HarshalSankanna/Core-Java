class This1 {
    int a;
    int b;

    This1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        This1 t = new This1(40, 80);
        t.display();
    }
}
