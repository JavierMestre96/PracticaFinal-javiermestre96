public class Electrica extends Herramienta{
    private final int potencia;

    Electrica(String marca, String nombre, String descripcion, double precio, int potencia){
        super(marca,nombre,descripcion,precio);
        this.potencia=potencia;
    }


    public int getPotenciaW() {
        return potencia;
    }

    public String info(){
        String informacion="";
        informacion+="HERRAMIENTA ELÉCTRICA: "+this.getNombre()+" "+this.getMarca()+"\n";
        informacion+=this.getDescripcion()+"\n";
        informacion+="Potencia: "+this.potencia+" V\n";
        informacion+="Precio: "+this.getPrecio()+" €\n";
        return informacion;
    }

    @Override
    public String toString() {
        return super.toString()+" Potencia: "+this.potencia+"V";
    }

}
