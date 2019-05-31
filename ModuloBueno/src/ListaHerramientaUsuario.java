import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ListaHerramientaUsuario extends JDialog {

    ListaHerramienta lista = new ListaHerramienta();
    JButton anyadir = new JButton("Añadir herramienta");
    JButton ver = new JButton("Ver lista");
    JButton guardar = new JButton("Guarda Lista");

    ListaHerramientaUsuario() {
        lista.existeFichero(VentanaUsuario.getDatosLeidos());
        JOptionPane.showMessageDialog(null, lista.muestraTodos());
        setLayout(new GridLayout(0, 2));
        add(anyadir);
        add(ver);
        add(guardar);

        anyadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lista.anyadeHerramienta();
            }
        });
        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, lista.muestraTodos());
            }
        });
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    lista.guardaListaFichero(VentanaUsuario.getDatosLeidos());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        pack();
        setVisible(true);

    }
}