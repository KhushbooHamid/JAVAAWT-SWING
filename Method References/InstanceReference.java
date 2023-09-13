interface inter{
    public void fxn1();
}

class work{
    public void fxn2(){
       
        for(int i=0;i<10;i++){
            System.out.println(i*2);
        }
    
    }

    public static void threadMethod(){
        System.out.println("threadMethod");
    }
}

public class InstanceReference {
    public static void main(String[] args) {
        System.out.println("Method Reference Example");
        work w = new work();
        Runnable r = w::fxn2;
        Thread t = new Thread(r);
        t.start();
    }
}
