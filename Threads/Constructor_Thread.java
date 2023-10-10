class thread1 extends Thread
{

    public thread1(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("running");
    }
}

class Main
{
    public static void main(String[] args) {
        thread1 t = new thread1("khush");

        t.start();
        
    }
}