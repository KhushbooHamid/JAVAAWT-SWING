import java.awt.*;
import java.awt.event.*;

import org.w3c.dom.Text;

public class ActionListenerEg extends Frame implements ActionListener {
    TextField tf;
    ActionListenerEg()
    {
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        tf.setText("Welcome");
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public static void main(String[] args) {
        new ActionListenerEg();
    }
    
}
