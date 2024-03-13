class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Child thread");
        }
    }
}

// class MyThread extends Thread {
// public void run() {
// for (int i = 1; i <= 10; ++i) {
// System.out.println("Child thread");
// }
// }
// }

public class Tthread {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.run();
        // MyThread m = new MyThread();
        // m.start();
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Main thread");
        }
    }
}
