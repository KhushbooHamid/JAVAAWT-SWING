abstract class Vehicle
{
    protected String brand;
    public Vehicle(String br)
    {
        brand=br;
    }
    abstract public void start();
    abstract public void stop();
}

class Car extends Vehicle
{

    public Car(String c)
    {
        super(c);
    }

    @Override
    public void start() {
        System.out.println("Starting the car: " + brand);
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car: " + brand);
    }
    
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle v = new Car("Hammar");
        v.start();
        v.stop();


    }
    
}
