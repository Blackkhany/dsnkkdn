import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    TextField tf; // Declare TextField as a class variable

    public static void main(String[] args) {
        ActionListenerExample example = new ActionListenerExample(); // Create an instance
        example.setupGUI();
    }

    public void setupGUI() {
        Frame f = new Frame("ActionListener Example");
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Javatpoint.");
    }
}