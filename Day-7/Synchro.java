class A {
    public static synchronized void print(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Batting = " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class MyClass1 extends Thread {
    public void run() {
        A.print("Sachin");
    }
}

class MyClass2 extends Thread {
    public void run() {
        A.print("Dhoni");
    }
}

class MyClass3 extends Thread {
    public void run() {
        A.print("Virat");
    }
}

class Synchro {
    public static void main(String[] args) {
        new MyClass1().start();
        new MyClass2().start();
        new MyClass3().start();
    }
}
