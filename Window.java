import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        setTitle("Test Window");
        JLabel label = new JLabel("Text inside window");
        add(label);

        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}   