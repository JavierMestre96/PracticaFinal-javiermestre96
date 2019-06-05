import java.io.Serializable;

public class Manual extends Herramienta{
    private final String mecanismo;

    public Manual(String marca, String nombre, String descripcion, double precio, String mecanismo) {
        super(marca, nombre, descripcion, precio);
        this.mecanismo = mecanismo;
    }

    public String getMecanismo() {
        return mecanismo;
    }


    public String info(){
        String informacion="HERRAMIENTA MANUAL\n";
        informacion+=super.info();
        informacion+="Mecanismo: "+this.mecanismo;
        return informacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                " mecanismo=" + mecanismo +
                '}';
    }
}
