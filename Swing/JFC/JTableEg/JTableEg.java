import javax.swing.*;

public class JTableEg {
    JTableEg()
    {
        JFrame f = new JFrame();

        String []cols = {"Name","Marks","Rollno"};

        String [][]rows = {
            {"abc","100","1"},
            {"efg","200","2"}
        };

        JTable t = new JTable(rows,cols);

        t.setBounds(30,40,200,300);

        f.add(t);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String []args)
    {
        new JTableEg();
    }
}
