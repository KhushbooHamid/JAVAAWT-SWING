import java.awt.*;

public class MyLabel extends Frame{
    MyLabel()
    {
        Label l = new Label("sixth sem");
        l.setBounds(50,100,100,50);
        add(l);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        new MyLabel();
    }
    
}
