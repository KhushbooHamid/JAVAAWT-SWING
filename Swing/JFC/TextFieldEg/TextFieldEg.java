import javax.swing.*;

public class TextFieldEg {
    TextFieldEg()
    {
        JFrame f = new JFrame();

        JTextField t = new JTextField();
        t.setBounds(100,200,100,30);

        f.add(t);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);


    }
    public static void main(String []args)
    {
        new TextFieldEg();
    }
    
}
