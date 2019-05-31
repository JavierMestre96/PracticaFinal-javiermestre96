import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNuevoUsuario extends JDialog {
    PanelUsuario panel = new PanelUsuario();
    ListaUsuarios lista = new ListaUsuarios();
    JButton anyadir = new JButton("Añadir usuario");

    VentanaNuevoUsuario(){
        setTitle("Añadir nuevo usuario");
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        add(anyadir, BorderLayout.SOUTH);
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lista.anyadeUsuario(VentanaUsuario.getDatosLeidos(),panel.getNombreU().getText(),panel.getApellidosU().getText(),panel.getEmailU().getText());
                dispose();
                ListaHerramientaUsuario l = new ListaHerramientaUsuario();
            }
        });
        pack();
        setVisible(true);
    }
}
