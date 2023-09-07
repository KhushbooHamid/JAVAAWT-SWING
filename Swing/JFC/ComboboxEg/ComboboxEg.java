import javax.swing.*;

public class ComboboxEg {
    ComboboxEg() {

        JFrame f = new JFrame();

        String ABC [] = { "CSE", "ECE", "CIV" };
        JComboBox b = new JComboBox(ABC);
        b.setBounds(40,80,70,40);

        f.add(b);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);


    }
    public static void main(String []args)
    {
        new ComboboxEg();
    }

}
