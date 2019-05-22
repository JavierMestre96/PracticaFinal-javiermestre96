import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaHerramienta {
    public static void main(String[] args) {

//        Ventana ventana = new Ventana();
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(0,4));
//        JButton boton = new JButton("Añadir herramienta");
//        boton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                lista.anyadeHerramienta();
//            }
//        });
//        panel.add(boton);
//        ventana.add(panel);
//        ventana.pack();
//        ventana.setVisible(true);

        JDialog pideHerramienta=new JDialog();
        pideHerramienta.setLayout(new FlowLayout());
        PanelHerramientaElectrica ventanaHerramienta=new PanelHerramientaElectrica();
        pideHerramienta.add(ventanaHerramienta);
        JButton boton =new JButton("Aceptar");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Comprobar si vale();
                Herramienta h=ventanaHerramienta.getHerramienta();
                pideHerramienta.dispose();
            }
        });
        pideHerramienta.add(boton);
        pideHerramienta.pack();
        pideHerramienta.setVisible(true);
    }
}
