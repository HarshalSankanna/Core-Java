class Test2 {
    public void show() {
        System.out.println("Hi");
    }
}

class UseMe {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.show();

    }
}