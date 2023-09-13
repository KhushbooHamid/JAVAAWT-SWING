class thread1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("hello");
            System.out.println("hello how are you");
        }
    }

}

class thread2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("6th sem is over almost");
            System.out.println("and i think i am as well");
        }
    }

}

public class RunnableThread {

    public static void main(String[] args) {
        Runnable t1 = new thread1();
        Runnable t2 = new thread2();

        Thread newt1 = new Thread(t1);
        Thread newt2 = new Thread(t2);

        newt1.start();
        newt2.start();

    }

}