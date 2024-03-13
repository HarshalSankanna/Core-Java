class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("child thread");
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("main thread");
        }
    }
}
