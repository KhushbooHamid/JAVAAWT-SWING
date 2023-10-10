import java.awt.*;
import java.awt.event.*;

public class MyKL extends Frame implements KeyListener{
    Label l;
    MyKL()
    {
        addKeyListener(this);
        l = new Label();
        l.setBounds(50,100,100,50);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("key pressed");
    }

    public void keyReleased(KeyEvent e)
    {
        l.setText("key released");
    }

    public void keyTyped(KeyEvent e)
    {
        l.setText("key typed");
    }

    public static void main(String[] args) {
        new MyKL();
    }
   
    
}
