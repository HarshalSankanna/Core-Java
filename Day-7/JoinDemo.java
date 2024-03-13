class Mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("child thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
}

class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythread m = new Mythread();
        m.start();
        m.join();
        for (int i = 1; i <= 10; ++i) {
            System.out.println("main thread");
        }
    }
}