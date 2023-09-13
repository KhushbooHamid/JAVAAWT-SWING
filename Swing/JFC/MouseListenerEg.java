import java.awt.*;
import java.awt.event.*;

public class MouseListenerEg extends Frame implements MouseListener {
    
    Label l;

    MouseListenerEg() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 200, 20); // Set label position and size
        add(l);
        setSize(300, 300);
        setTitle("Mouse Listener Example");
        // Using FlowLayout as an example of a layout manager
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseListenerEg();
    }
}
