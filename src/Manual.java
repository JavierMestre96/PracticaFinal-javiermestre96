public class Manual extends Herramienta {
    private final String mecanismo;

    public Manual(String marca, String nombre, String descripcion, int precio, String mecanismo) {
        super(marca, nombre, descripcion, precio);
        this.mecanismo = mecanismo;
    }

    public String getMecanismo() {
        return mecanismo;
    }


    @Override
    public String toString() {
        return super.toString() +
                " longitud=" + mecanismo +
                '}';
    }
}
