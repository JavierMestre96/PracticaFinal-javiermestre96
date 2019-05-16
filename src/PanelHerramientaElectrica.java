import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHerramientaElectrica extends Panel {

    JLabel potencia = new JLabel("Potencia en vatios: ");
    JTextField potenciaW = new JTextField(new Integer(0));
    JButton creaHerramienta = new JButton("Añadir herramienta");

    PanelHerramientaElectrica(){

        panelEtiquetas.add(potencia);
        panelEtiquetas.add(potenciaW);
        creaHerramienta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String marca = getMarcaH().getText();
                    String nombre = getNombreH().getText();
                    String descripcion = getDescripcionH().getText();
                    double precio = Double.parseDouble(getPrecioH().getText());
                    int potencia = Integer.parseInt(potenciaW.getText());
                    if("".equals(marca)){
                        JOptionPane.showMessageDialog(null,"Marca no puede estar vacía");
                        System.out.println("ERROR");
                    }
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                }

            }
        });
        add(creaHerramienta,BorderLayout.SOUTH);

    }
}
