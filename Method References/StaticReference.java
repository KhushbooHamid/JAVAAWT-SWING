interface inter {
    void fxn1();
}

class work {
    public static void fxn2() {
        System.out.println("fxn2");
    }

    public static void threadMethod() {
        System.out.println("threadMethod");
    }
}

public class StaticReference {
    public static void main(String[] args) {
        System.out.println("Method Reference Example");
        inter i = work::fxn2;
        Runnable r = work::threadMethod;
        Thread t = new Thread(r);
        t.start();
    }
}
