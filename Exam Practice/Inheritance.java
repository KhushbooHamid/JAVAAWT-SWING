class Point2d
{
    int x=10;
    int y=20;

    void display()
    {
        System.out.println("x is "+ x + "y is " + y);
    }
}

class Point3d extends Point2d
{
    int z=30;
    void dispaly1()
    {
        System.out.println("x is "+ x + "y is " + y + " z " + z);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Point2d p1 = new Point2d();
        Point3d p2 = new Point3d();

        p1.display();
        p2.dispaly1();
    }
    
}
