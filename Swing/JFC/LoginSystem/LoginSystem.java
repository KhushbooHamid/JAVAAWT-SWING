import javax.swing.*;

public class LoginSystem
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();

        f.setSize(600, 600);
        f.setVisible(true);
        f.setLayout(null);

        JLabel l = new JLabel("username");
        l.setBounds(40, 30, 100, 30);
        f.add(l);

        JLabel l1 = new JLabel("password");
        l1.setBounds(40, 80, 100, 30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 140, 40);
        f.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 80, 140, 40);
        f.add(t2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // added this so closing the application would also close the program in terminal

    }

}
