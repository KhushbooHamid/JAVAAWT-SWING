import javax.swing.*;

public class LabelEg {
    LabelEg()
    {
        JFrame f = new JFrame();

        JLabel l = new JLabel("new label");
        l.setBounds(30,100,150,40);
        f.add(l);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);

    }
    public static void main(String []args)
    {
        new LabelEg();
    }
    
}
