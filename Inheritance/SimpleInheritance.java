class point2D{
    int x,y;
    public void fxn1()
    {
        System.out.println("i am fxn1 of point2D x: "+ x + " y: " + y);
    }
}

class point3D extends point2D{
    int z;
    public void fxn2()
    {
        System.out.println("i am fxn2 of point3D "+" x: " + x + " y: " + y + " z: " + z);
    }
}

public class SimpleInheritance {

   public static void main(String[] args) {
    point2D p1 = new point2D();
    point3D p2 = new point3D();

    p1.x=10;
    p1.y=20;

    p1.fxn1();

    p2.x=1;
    p2.y=2;
    p2.z=3;

    p2.fxn1();
    p2.fxn2();
   }
    
}
