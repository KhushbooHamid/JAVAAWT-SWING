
class thread1 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("salaam");
            System.out.println("wasalam");
        }
    }
}

class thread2 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("asalamalaikum");
            System.out.println("walaikumasalam");
        }
    }
}

public class ExtendsThread {
    public static void main(String []args)
    {
        thread1 t1=new thread1();
        thread2 t2=new thread2();

        // t1.run(); if we are using run only the first described one runs
        // t2.run();

        t1.start(); // with start both t1 and t2 runs
        t2.start();
    }
    
}
