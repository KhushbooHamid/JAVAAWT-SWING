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
        Runnable bullet1 = new thread1();
        Runnable bullet2 = new thread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }

}