import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaHerramienta implements Utilizable{
    private List<Herramienta> lista;

    @Override
    public String toString() {
        return "ListaHerramienta{" +
                "lista=" + lista +
                '}';
    }

    public ListaHerramienta() {
        lista=new ArrayList<>();
    }

    public void anyadeHerramienta(){
       VentanaOpciones opciones = new VentanaOpciones();
       lista.add(opciones.getHerramienta());
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

    public static void main(String[] args) {
        ListaHerramienta lista = new ListaHerramienta();
        lista.anyadeHerramienta();
        System.out.println(lista);
    }
}

