import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaHerramienta {
    public static void main(String[] args) {

        ListaHerramienta lista = new ListaHerramienta();
        Ventana ventana = new Ventana();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,4));
        JButton boton = new JButton("Añadir herramienta");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lista.anyadeHerramienta();
            }
        });
        panel.add(boton);
        ventana.add(panel);
        ventana.pack();
        ventana.setVisible(true);
    }
}
