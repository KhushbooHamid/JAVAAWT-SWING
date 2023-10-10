import java.awt.*;

public class MyButton extends Frame{
    MyButton()
    {
        Button b = new Button("hi");
        b.setBounds(30,80,100,40);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new MyButton();
    }
    
}
