import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener
{
    JFrame f;
    CardLayout crd;
    JPanel cPane;

    Main()
    {
        f = new JFrame();
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");

        b1.setBackground(Color.CYAN);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.YELLOW);
        b4.setBackground(Color.PINK);
        b5.setBackground(Color.RED);

        crd = new CardLayout();
        cPane = new JPanel();
        cPane.setLayout(crd);

        cPane.add(b1, "a");
        cPane.add(b2, "b");
        cPane.add(b3, "c");
        cPane.add(b4, "d");
        cPane.add(b5, "e");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.add(cPane); // Add the cPane to the JFrame

        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        crd.next(cPane);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}