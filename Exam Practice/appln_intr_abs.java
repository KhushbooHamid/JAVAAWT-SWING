abstract class vehicle
{
    String brand;
    vehicle(String br)
    {
        brand=br;
    }
    abstract void start();
    abstract void stop();
    
}

class car extends vehicle
{
    car(String c)
    {
        super(c);
    }

    @Override
    void start() {
       System.out.println("startting the car " + brand);
    }

    @Override
    void stop() {
        System.out.println("stopping the car " + brand);
      
    }
    
}

public class appln_intr_abs {
    public static void main(String[] args) {
        car c1 = new car("bettle");
        c1.start();
        c1.stop();
    }
    
}
