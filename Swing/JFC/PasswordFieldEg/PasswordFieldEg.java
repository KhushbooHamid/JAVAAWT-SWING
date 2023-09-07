import javax.swing.*;

public class PasswordFieldEg {
    PasswordFieldEg()
    {
        JFrame f = new JFrame();

        JTextField t = new JTextField("write something");
        t.setBounds(30,100,150,40);

        JPasswordField p = new JPasswordField();
        p.setBounds(50,150,200,60);

        f.add(t);
        f.add(p);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    
    public static void main(String []args)
    {
        new PasswordFieldEg();
    }
}
