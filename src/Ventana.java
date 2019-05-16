import javax.swing.*;
import java.awt.*;

public class Ventana extends JDialog {
    Ventana(){
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
    }
}
