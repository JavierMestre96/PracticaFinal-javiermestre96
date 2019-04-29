import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    Ventana(){
        setLayout(new GridLayout(0,1));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250,250);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
