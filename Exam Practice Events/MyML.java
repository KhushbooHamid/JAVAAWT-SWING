import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyML extends Frame implements MouseListener
 {
    Label L;
    
    MyML()
    {
        addMouseListener(this);
        L = new Label();
        L.setBounds(50,100,100,50);
        add(L);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public void mouseClicked(MouseEvent e)
    {
        L.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e)
    {
        L.setText("Mouse Pressed");
    }
   
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
     
    }
     public static void main(String[] args) {
        new MyML();
    }

}
