import java.awt.*;
import java.awt.event.*;


public class Login {
    public static void main(String[] args) {

    Frame f = new Frame("LOGIN PAGE");

   Label l1 = new Label("username");
   l1.setBounds(50,50,100,30);


   Label l2 = new Label("password");
   l2.setBounds(50,100,100,30);


   TextField f1 = new TextField();
   f1.setBounds(150,50,150,30);

   

   TextField f2 = new TextField();
   f2.setBounds(150,100,150,30);




    f.add(l1);
  

    f.add(l2);

    f.add(f1);


    f.add(f2);

    // f.add(b1);
    // f.add(b2);



    f.setSize(500,500);
        f.setLayout(null);

            f.setVisible(true);


    }
    
}
