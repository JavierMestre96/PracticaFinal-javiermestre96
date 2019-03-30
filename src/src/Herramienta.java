import java.util.ArrayList;
import java.util.List;

public abstract class Herramienta {
    private final String marca;
    private final String nombre;
    private final String descripcion;
    private int precio;
    private List<Accesorio> accesorios = new ArrayList<>();

    Herramienta(String marca, String nombre, String descripcion, int precio){
        this.marca=marca;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void anyadeAccesorio(String nombre){
        this.accesorios.add(new Accesorio(nombre));
    }

    public void setAccesorios(List<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
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
                ", accesorios=" + accesorios +
                '}';
    }
}
