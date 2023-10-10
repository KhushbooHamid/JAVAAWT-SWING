import java.awt.*;

public class MyPanel {
    public static void main(String[] args) {
        Frame f = new Frame("first frame");
        Panel p = new Panel();
        p.setBounds(30,80,100,40);
        f.setSize(400,400);
        f.setBackground(Color.BLUE);
        f.add(p);
        f.setVisible(true);
    }
}
