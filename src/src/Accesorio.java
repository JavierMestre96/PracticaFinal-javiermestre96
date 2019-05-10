public class Accesorio{
    private final String nombre;

    public Accesorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}