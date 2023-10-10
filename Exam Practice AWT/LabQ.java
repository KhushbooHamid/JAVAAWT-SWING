import java.awt.*;

//textfield, choice, button, textarea, list

public class LabQ {
    public static void main(String[] args) {
        
        Frame f = new Frame("Application Window");

        Button b = new Button("Click me!");
        b.setBounds(50,100,100,50);

        TextField t = new TextField("dept:");
        t.setBounds(50,160,100,40);

        TextArea a = new TextArea("write here");
        a.setBounds(50,220,100,40);

        Choice c = new Choice();
        c.setBounds(50,300,100,40);
        c.add("csse");
        c.add("ece");
        c.add("me");

        f.add(b);
        f.add(t);
        f.add(a);
        f.add(c);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);

        
        
    }
    
}
