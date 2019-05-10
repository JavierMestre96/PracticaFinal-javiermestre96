import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaHerramienta implements Utilizable{
    private List<Herramienta> lista;

    public ListaHerramienta() {
        lista=new ArrayList<>();
    }

    public void anyadeHerramienta(){
        tipoHerramienta();
    }

    public void tipoHerramienta(){
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
        System.out.println(tipo);
    }
}

