import java.awt.*;
import java.awt.event.*;

public class KeyListenerEg extends Frame implements KeyListener {
    Label l;

    KeyListenerEg() {
        addKeyListener(this);

        l = new Label();
        l.setBounds(20, 50, 300, 20); // Set label position and size
        add(l);
        setSize(400, 400);
        setTitle("Key Listener Example");
        // Using FlowLayout as an example of a layout manager
        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Handle keyTyped event here
        l.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle keyPressed event here
        l.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Handle keyReleased event here
        l.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public static void main(String[] args) {
        new KeyListenerEg();
    }
}
