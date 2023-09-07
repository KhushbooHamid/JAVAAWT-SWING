import javax.swing.*;

public class SavingPgm {
    public static void main(String[] args) {
    JFrame f = new JFrame("new jframe");
    JButton b = new JButton("new button");
   
    b.setBounds(30,100,150,40);
    f.add(b);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
    }
 
}
