import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHerramientaManual extends Panel {

        Manual m;
        JLabel etiquetaMecanismo = new JLabel("Tipo de mecanismo: ");
        JFormattedTextField mecanismoH = new JFormattedTextField();

        PanelHerramientaManual(){
            panelEtiquetas.add(etiquetaMecanismo);
            panelEtiquetas.add(mecanismoH);
        }

    public Herramienta getHerramienta() {
       m=new Manual(getMarcaH().getText(),getNombreH().getText(),getDescripcionH().getText(),Double.parseDouble(getPrecioH().getText()),mecanismoH.getText());
       return m;
    }



}

