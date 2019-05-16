import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//Poner abstract de nuevo al acabar
public abstract class Herramienta {
    private final String marca;
    private final String nombre;
    private final String descripcion;
    private double precio;

    Herramienta(String marca, String nombre, String descripcion, int precio){
        this.marca=marca;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio/100;
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
