import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHerramientaElectrica extends Panel {

    Electrica e;
    JLabel potencia = new JLabel("Potencia en vatios: ");
    JTextField potenciaW = new JTextField();
    JButton creaHerramienta = new JButton("Añadir herramienta");

    PanelHerramientaElectrica(){


        panelEtiquetas.add(potencia);
        panelEtiquetas.add(potenciaW);
        creaHerramienta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    String marca = getMarcaH().getText();
                    String nombre = getNombreH().getText();
                    String descripcion = getDescripcionH().getText();
                    double precio = Double.parseDouble(getPrecioH().getText());
                    int potencia = Integer.parseInt(potenciaW.getText());
                }catch (NullPointerException npe){
                    JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                }

            }
        });
        add(creaHerramienta,BorderLayout.SOUTH);

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
