import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAL extends Frame implements ActionListener{
    TextField t;
    MyAL()
    {
        // addActionListener(this);
        t = new TextField();
        t.setBounds(50,100,100,50);

        add(t);

        Button b1 = new Button("b1");
        b1.setBounds(50,150,100,50);

        b1.addActionListener(this);

        add(b1);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        t.setText("sixth sem over");
    }
    public static void main(String[] args) {
        new MyAL();
    }

    
}
