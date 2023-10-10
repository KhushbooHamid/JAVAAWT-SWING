class Rectangle{
    private int length;
    private int breadth;

    public Rectangle()
    {
        length=0;
        breadth=0;
    }

    public Rectangle(int length, int breadth)
    {
        
        setLength(length);
        setBreadth(breadth);
    }

    public void setLength(int l)
    {
        length = l;
    }

    public void setBreadth(int b)
    {
        breadth = b;
    }


    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public int area()
    {
        return length*breadth;
    }


}

public class Main {

    public static void main(String[] args) {
    
    Rectangle r = new Rectangle();
    Rectangle r1 = new Rectangle(3,4);

    System.out.println(r.area());   
    System.out.println(r1.area());
    }


    
}
