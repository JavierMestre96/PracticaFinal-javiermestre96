import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class PruebaHerramienta {
    public static void main(String[] args) throws FileNotFoundException {

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


//        -------------------------------------
//        ListaHerramienta lista = new ListaHerramienta();
//        JDialog pideHerramienta=new JDialog();
//        pideHerramienta.setLayout(new FlowLayout());
//        JButton boton =new JButton("Añadir herramienta");
//        JButton boton2 = new JButton("Ver lista");
//        boton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Comprobar si vale();
//                lista.anyadeHerramienta();
//            }
//        });
//        boton2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(null,lista.muestraTodos());
//            }
//        });
//        pideHerramienta.add(boton);
//        pideHerramienta.add(boton2);
//        pideHerramienta.pack();
//        pideHerramienta.setVisible(true);
        VentanaUsuario v = new VentanaUsuario();
    }
}
