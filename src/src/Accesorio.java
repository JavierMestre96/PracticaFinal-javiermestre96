public class Accesorio{
    private final String nombre;
    private final Tipo tipo = Tipo.ACCESORIO;

    public Tipo getTipo() {
        return tipo;
    }

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
