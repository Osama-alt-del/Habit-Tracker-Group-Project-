import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Window extends JFrame {

    public Window() {
        setTitle("Test Window");

        // Create time and format it
        LocalDateTime timeObj = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        String formattedTime = timeObj.format(formatter);
        JLabel label = new JLabel(formattedTime);
        add(label);

        // Widow settings
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}   