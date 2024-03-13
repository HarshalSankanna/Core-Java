class GetSetThread extends Thread {
    public void run() {
        System.out.println("run() method");
    }

    public static void main(String[] args) {
        GetSetThread t1 = new GetSetThread();
        GetSetThread t2 = new GetSetThread();
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();
        t1.setName("Harshal");
        System.out.println("Name of t1 after changing name: " + t1.getName());
        System.out.println("Name of t2 after changing name: " + t2.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
