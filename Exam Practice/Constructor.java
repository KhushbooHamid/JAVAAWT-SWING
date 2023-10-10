class Rectangle
{
    int length;
    int breadth;

    Rectangle()
    {
        length=0;
        breadth=0;
    }

    Rectangle(int l, int b)
    {
        setLength(l);
        setBreadth(b);
    }

    void setLength(int l)
    {
        length=l;
    }
    void setBreadth(int b)
    {
        breadth = b;
    }
    int getLength()
    {
        return length;
    }
    int getBreadth()
    {
        return breadth;
    }
    int area()
    {
        return length*breadth;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);

        System.out.println(r2.area());
        System.out.println(r1.area());


    }
    
}
