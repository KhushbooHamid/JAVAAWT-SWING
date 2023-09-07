import javax.swing.*;

public class LoginSystem {
    public static void main(String []args)
    {
        JFrame f = new JFrame();

        JLabel l = new JLabel("username");
        l.setBounds(40,30,100,80);

        JLabel l1 = new JLabel("password");
        l1.setBounds(60,60,120,100);

        JTextField t1=new JTextField();
        t1.setBounds(120,100,140,40);

        JTextField t2=new JTextField();
        t2.setBounds(120,100,100,80);

        f.add(l);
        f.add(l1);

        f.add(t1);
        f.add(t2);

        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);


    }
  
}
