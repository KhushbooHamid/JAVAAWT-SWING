import javax.swing.*;

public class CheckboxEg {
    CheckboxEg()
    {
        JFrame f = new JFrame();

        JCheckBox c1 = new JCheckBox("CSE");  
        c1.setBounds(100,100,80,20);
        JCheckBox c2 = new JCheckBox("ECE");
        c2.setBounds(100,110,80,20);

        ButtonGroup  bg = new ButtonGroup();
        bg.add(c1);      
        bg.add(c2);

        f.add(c1);
        f.add(c2);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);

    }
    public static void main(String []args)
    {
        new CheckboxEg();
    }
}
