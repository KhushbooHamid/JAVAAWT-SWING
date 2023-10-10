import javax.swing.*;

public class general {
    public static void main(String[] args) {
        JFrame f =new JFrame("frameee");

        JRadioButton p = new JRadioButton("checkbox");
        p.setBounds(50,100,100,50);

        JRadioButton p1 = new JRadioButton("checkbox1");
        p1.setBounds(50,140,100,50);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(p);
        bg.add(p1);

        f.add(p);
        f.add(p1);


        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

        
    }
    
}
