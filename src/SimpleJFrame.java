import javax.swing.*;
import java.awt.*;

public class SimpleJFrame extends JFrame {
    SimpleJFrame(String s){
        super(s);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,1));
        JLabel l1 = new JLabel();
    }
}
