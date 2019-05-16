import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaHerramienta implements Utilizable{
    private List<Herramienta> lista;

    public ListaHerramienta() {
        lista=new ArrayList<>();
    }

    public void anyadeHerramienta(){
        String tipo = tipoHerramienta();
        Ventana ventana = new Ventana();
        ventana.setLayout(new BorderLayout());
        if (tipo.equals("ELECTRICA")){
            ventana.add(new PanelHerramientaElectrica(),BorderLayout.CENTER);
            ventana.pack();
            ventana.dispose();
            ventana.setVisible(true);
        }else{
            ventana.add(new PanelHerramientaManual(),BorderLayout.CENTER);
            ventana.pack();
            ventana.dispose();
            ventana.setVisible(true);
        }
    }

    public String tipoHerramienta(){
        List<String> tipos = new ArrayList<>();
        tipos.add("ELECTRICA");
        tipos.add("MANUAL");

        String tipo=(String) JOptionPane.showInputDialog(null,
                "¿Qué tipo de herramienta quieres añadir a la lista?",
                "Elige un tipo de herramienta",
                JOptionPane.WARNING_MESSAGE,
                null,
                tipos.toArray(),
                tipos.get(0));
        return tipo;
    }
}

