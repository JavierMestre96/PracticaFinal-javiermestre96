import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHerramientaManual extends Panel {

        Manual m;
        JLabel etiquetaMecanismo = new JLabel("Tipo de mecanismo: ");
        JFormattedTextField mecanismoH = new JFormattedTextField();
        JButton creaHerramienta = new JButton("Añadir herramienta");

        PanelHerramientaManual(){
            panelEtiquetas.add(etiquetaMecanismo);
            panelEtiquetas.add(mecanismoH);
            creaHerramienta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        String marca = getMarcaH().getText();
                        String nombre = getNombreH().getText();
                        String descripcion = getDescripcionH().getText();
                        double precio = Double.parseDouble(getPrecioH().getText());
                        String mecanismo = mecanismoH.getText();
                    }catch (NullPointerException npe){
                        JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                    }
                }
            });
            add(creaHerramienta,BorderLayout.SOUTH);
        }

    public Herramienta getHerramienta() {
       m=new Manual(getMarcaH().getText(),getNombreH().getText(),getDescripcionH().getText(),Double.parseDouble(getPrecioH().getText()),mecanismoH.getText());
       return m;
    }



}

