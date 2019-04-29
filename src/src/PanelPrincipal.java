import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal {
    private Ventana ventana = new Ventana();
    private Panel panel = new Panel();
    private JButton crear = new JButton("Añadir herramienta");

    PanelPrincipal(){
        ventana.add(panel);
        ventana.add(crear, BorderLayout.SOUTH);
        ventana.setVisible(true);

        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    String nombreHerramienta = panel.getNombreH().getText();
                    double precioHerramienta = Double.parseDouble(panel.getPrecioH().getText());
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,nfe.getMessage());
                }

            }
        });
    }
}
