public class HerramientaElectrica extends Herramienta{
    private final Tipo tipo;
    private final int potenciaW;

    HerramientaElectrica(String marca,String nombre,String descripcion,int precio, int potenciaW){
        super(marca,nombre,descripcion,precio);
        this.tipo=Tipo.ELECTRICA;
        this.potenciaW=potenciaW;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getPotenciaW() {
        return potenciaW;
    }

    @Override
    public String toString() {
        return super.toString()+" tipo: "+this.tipo+" Potencia: "+this.potenciaW+"W";
    }


}
