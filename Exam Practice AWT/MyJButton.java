import javax.swing.*;

public class MyJButton {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("a frame for a button");
        JButton b1 = new JButton("click me");
        JLabel l1 = new JLabel("type here");
        b1.setBounds(50,100,100,50);
        l1.setBounds(50,180,100,50);

        f1.add(b1);
        f1.add(l1);
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setLayout(null);
    }
    
}