import java.io.Serializable;

public class Electrica extends Herramienta{
    private final int potencia;

    Electrica(String marca, String nombre, String descripcion, double precio, int potencia){
        super(marca,nombre,descripcion,precio);
        compruebaPotencia(potencia);
        this.potencia=potencia;
    }

    public void compruebaPotencia(int potencia){
        if (potencia == 0){
            throw new IllegalArgumentException("La potencia no puede ser cero");
        }
    }

    public int getPotenciaW() {
        return potencia;
    }

    public String info(){
        String informacion="HERRAMIENTA ELECTRICA\n";
        informacion += super.info();
        informacion+="Potencia: "+this.potencia+" V\n";
        return informacion;
    }

    @Override
    public String toString() {
        return super.toString()+" Potencia: "+this.potencia+"V";
    }

}
