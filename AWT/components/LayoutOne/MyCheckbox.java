import java.awt.*;

public class MyCheckbox extends Frame{
    MyCheckbox()
    {
        Checkbox c = new Checkbox("cse" , true);
        c.setBounds(30,100,80,30);

        Checkbox c1 = new Checkbox("ece");
        c1.setBounds(30,80,80,30);

        add(c);
        add(c1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
 }
 public static void main(String[] args) {
    new MyCheckbox();
 }

    
}
