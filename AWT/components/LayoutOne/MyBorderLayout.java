import java.awt.*;

import javax.swing.border.Border;

public class MyBorderLayout {
    MyBorderLayout()
    {
        Frame f = new Frame();

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.NORTH);
        f.add(b3,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.WEST);

        f.setSize(500,500);

        f.setVisible(true);


   }
   public static void main(String[] args) {
       new MyBorderLayout();
   }
}
 

