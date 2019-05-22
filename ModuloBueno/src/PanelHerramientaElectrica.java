import javax.swing.*;

public class PanelHerramientaElectrica extends Panel {

    Electrica e;
    JLabel potencia = new JLabel("Potencia en vatios: ");
    JTextField potenciaW = new JTextField();

    PanelHerramientaElectrica(){
        panelEtiquetas.add(potencia);
        panelEtiquetas.add(potenciaW);
    }

    public Herramienta getHerramienta() {
        try{
            e=new Electrica(getMarcaH().getText(),getNombreH().getText(),getDescripcionH().getText(),Double.parseDouble(getPrecioH().getText()),Integer.parseInt(potenciaW.getText()));
        }catch (IllegalArgumentException iae){
            iae.getMessage();
        }
        return e;
    }
}
