import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//Poner abstract de nuevo al acabar
public abstract class Herramienta {
    private final String marca;
    private final String nombre;
    private final String descripcion;
    private double precio;

    Herramienta(String marca, String nombre, String descripcion, double precio){
        compruebaMarca(marca);
        compruebaNombre(nombre);
        compruebaDescripcion(descripcion);
        compruebaPrecio(precio);

        this.marca=marca;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public void compruebaMarca(String marca){
        if ("".equals(marca)){
            throw new IllegalArgumentException("Marca no válida");
        }
    }
    public void compruebaNombre(String nombre){
        if ("".equals(nombre)){
            throw new IllegalArgumentException("Nombre no válido.");
        }
    }
    public void compruebaDescripcion(String descripcion){
        if ("".equals(descripcion)){
            throw new IllegalArgumentException("Descripción no válida.");
        }
    }
    public void compruebaPrecio(double precio){
        if (precio == 0){
            throw new IllegalArgumentException("El precio no puede ser cero.");
        }
    }


    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
