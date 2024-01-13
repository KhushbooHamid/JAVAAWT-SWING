import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private TextField t;

    Main(int rows, int cols) {
        Frame f = new Frame();

        t = new TextField();
        t.setBounds(50, 50, 400, 50);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(rows, cols));

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b10 = new Button("+");

        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b11 = new Button("-");

        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b12 = new Button("*");

        Button b13 = new Button("=");
        Button b14 = new Button("/");

        // Add action listeners to each button
        addActionListener(b1);
        addActionListener(b2);
        addActionListener(b3);
        addActionListener(b10);
        addActionListener(b4);
        addActionListener(b5);
        addActionListener(b6);
        addActionListener(b11);
        addActionListener(b7);
        addActionListener(b8);
        addActionListener(b9);
        addActionListener(b12);
        addActionListener(b13);
        addActionListener(b14);

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b10);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b11);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(b12);
        buttonPanel.add(b13);
        buttonPanel.add(b14);

        f.add(t, BorderLayout.NORTH);
        f.add(buttonPanel, BorderLayout.CENTER);

        f.setSize(500, 500);
        f.setVisible(true);
    }

    private void addActionListener(Button button) {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buttonText = button.getLabel();
                String currentText = t.getText();
                t.setText(currentText + buttonText);
            }
        });
    }

    public static void main(String[] args) {
        new Main(4, 5);
    }
}
