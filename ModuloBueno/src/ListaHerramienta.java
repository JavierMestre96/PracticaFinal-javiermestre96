import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListaHerramienta implements Utilizable,Serializable{
    private List<Herramienta> lista;

    private File archivoGuardado;

    public ListaHerramienta() {
        lista=new ArrayList<>();
    }

    public String muestraTodos(){
        String salida="";

        if (lista.size()==0){
            return "No tienes herramientas en la lista";
        }else{
            for (Herramienta h: lista) {
                salida+=h.info()+"\n";
            }
        }

        return salida;
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

    @Override
    public String toString() {
        return "ListaHerramienta{" +
                "lista=" + lista +
                '}';
    }

    public void existeFichero(String nombre){
        archivoGuardado = Paths.get(nombre).toFile();
        if (archivoGuardado.exists()){
            ListaHerramienta nuevaLista;
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoGuardado))){
                nuevaLista = (ListaHerramienta) ois.readObject();
                this.lista = nuevaLista.getLista();
            } catch (Exception e){
                e.printStackTrace();
            }
        }else{
            try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(archivoGuardado))) {
                oos.writeObject(this.lista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardaListaFichero(String nombre) throws IOException {
        archivoGuardado = Paths.get(nombre).toFile();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoGuardado))){
                oos.writeObject(this);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }

    public List<Herramienta> getLista() {
        return lista;
    }
}

