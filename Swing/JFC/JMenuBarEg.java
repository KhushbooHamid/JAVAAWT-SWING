import javax.swing.*;

public class JMenuBarEg {

    JMenu menu, submenu, submenu1;
    JMenuItem i1, i2, i3, i4, i5;

    JMenuBarEg() {
        JFrame f = new JFrame("menu");
        JMenuBar mb = new JMenuBar();

        menu = new JMenu("dept");
        submenu = new JMenu("cse");
        submenu1 = new JMenu("ece");

        i1 = new JMenuItem("first sem");
        i2 = new JMenuItem("second sem");
        i3 = new JMenuItem("third sem");
        i4 = new JMenuItem("fourth sem");
        i5 = new JMenuItem("fifth sem");

        menu.add(submenu);
        menu.add(submenu1);

        submenu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        submenu.add(i5);


        mb.add(menu);

        f.add(mb);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new JMenuBarEg();
    }
}
