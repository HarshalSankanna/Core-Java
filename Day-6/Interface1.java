/**
 * Abc
 */
interface Abc {
    public void show();
}

class Pqr {
    static int i = 20;
}

public class Interface1 extends Pqr implements Abc {

    public void show() {
        System.out.println("I am in Abc");
    }

    public static void main(String[] args) {
        Abc a;
        Interface1 I = new Interface1();
        a = I;
        a.show();
        System.out.println(i);
    }
}
