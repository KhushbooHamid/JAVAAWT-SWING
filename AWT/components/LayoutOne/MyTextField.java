import java.awt.*;

public class MyTextField extends Frame {
    MyTextField()
    {
        Choice t1 = new Choice();

        t1.add("a");
        t1.add("a");
        t1.add("a");
        t1.add("a");
        t1.add("a");     


        add(t1);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        new MyTextField();
    }
}
