import javax.swing.*;
import java.awt.*;

public class PanelUsuario extends JPanel {

    private JLabel nombre = new JLabel("Nombre: ");
    private JTextField nombreU = new JTextField();
    private JLabel apellidos = new JLabel("Apellidos: : ");
    private JTextField apellidosU = new JTextField();
    private JLabel email = new JLabel("Correo eléctronico: ");
    private JTextField emailU = new JTextField();

    PanelUsuario(){
        setLayout(new GridLayout(0,2));
        add(nombre);
        add(nombreU);
        add(apellidos);
        add(apellidosU);
        add(email);
        add(emailU);
    }

    public JTextField getNombreU() {
        return nombreU;
    }

    public JTextField getApellidosU() {
        return apellidosU;
    }

    public JTextField getEmailU() {
        return emailU;
    }
}
