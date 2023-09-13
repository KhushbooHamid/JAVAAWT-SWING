class thread1 extends Thread{
    public thread1(String name)
    {
        super(name);
    }
    public void run()
    {
        boolean flag = true;
        while(flag)
        {
            System.out.println("thread " + this.getName());
            flag=false;
            try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class ParameterThread {
    public static void main(String[] args) {
        thread1 t1=new thread1("khush");
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        // t1.setName("I am cute");
        System.out.println("name is "+t1.getName());
        System.out.println("id is "+t1.getId());

        try{
            t1.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
    
}
