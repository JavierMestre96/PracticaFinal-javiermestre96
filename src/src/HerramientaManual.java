public class HerramientaManual extends Herramienta {
    private final int longitud;
    private final Tipo tipo;

    public HerramientaManual(String marca, String nombre, String descripcion, int precio, int longitud) {
        super(marca, nombre, descripcion, precio);
        this.longitud = longitud;
        this.tipo = Tipo.MANUAL;
    }

    public int getLongitud() {
        return longitud;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " longitud=" + longitud +
                ", tipo=" + tipo +
                '}';
    }
}
