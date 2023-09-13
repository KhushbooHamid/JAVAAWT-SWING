interface Shape{
    double calArea();

}

class Circle implements Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double calArea()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length= length;
        this.breadth=breadth;

    }

    public double calArea()
    {
        return length*breadth;
    }
}



public class InterfaceClass {

   public static void main(String []args)
   {
     Shape s = new Circle(5);
    System.out.println("area is :" + s.calArea());

    Shape s1 = new Rectangle(4,3);
    System.out.println("area is : "+ s1.calArea());
   }
    
}
