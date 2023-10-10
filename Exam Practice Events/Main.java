import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements MouseListener
{
    Label l;
    Main()
    {
        addMouseListener(this);

        l = new Label("hi");
        l.setBounds(50,100,100,50);

        add(l);
        
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }

    public void mouseClicked(MouseEvent e)
    {
        l.setText("mouse clicked");
    }

      public void mousePressed(MouseEvent e)
    {
        l.setText("mouse pressed");
    }

     public void mouseReleased(MouseEvent e)
    {
        l.setText("mouse released");
    }

     public void mouseEntered(MouseEvent e)
    {
        l.setText("mouse Entered");
    }

     public void mouseExited(MouseEvent e)
    {
        l.setText("mouse exited");
    }

    public static void main(String[] args) {
        new Main();
    }
}

