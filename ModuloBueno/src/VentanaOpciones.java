import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpciones extends JDialog {
    private ListaHerramienta lista = new ListaHerramienta();
    private String tipoHerramienta = lista.tipoHerramienta();
    JButton creaHerramienta = new JButton("Añadir herramienta");
    private Herramienta h;

    VentanaOpciones(){
        setLayout(new BorderLayout());
        if (tipoHerramienta.equals("ELECTRICA")){
            setTitle("Panel de herramienta eléctrica");
            PanelHerramientaElectrica panel = new PanelHerramientaElectrica();
            add(panel, BorderLayout.CENTER);
            creaHerramienta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        String marca = panel.getMarcaH().getText();
                        String nombre = panel.getNombreH().getText();
                        String descripcion = panel.getDescripcionH().getText();
                        double precio = Double.parseDouble(panel.getPrecioH().getText());
                        int potencia = Integer.parseInt(panel.potenciaW.getText());
                        h=panel.getHerramienta();
                        dispose();
                    }catch (NullPointerException npe){
                        JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                    }
                }
            });
            add(creaHerramienta,BorderLayout.SOUTH);
        }else{
            setTitle("Panel de herramienta manual");
            PanelHerramientaManual panel = new PanelHerramientaManual();
            add(panel,BorderLayout.CENTER);
            creaHerramienta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try{
                        String marca = panel.getMarcaH().getText();
                        String nombre = panel.getNombreH().getText();
                        String descripcion = panel.getDescripcionH().getText();
                        double precio = Double.parseDouble(panel.getPrecioH().getText());
                        String mecanismo = panel.mecanismoH.getText();
                        h=panel.getHerramienta();
                        dispose();
                    }catch (NullPointerException npe){
                        JOptionPane.showMessageDialog(null,"ERROR. Uno o más campos están vacios.");
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Introduce un precio válido");
                    }
                }
            });
            add(creaHerramienta,BorderLayout.SOUTH);
        }
        setModal(true);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public Herramienta getHerramienta(){
        return h;
    }
}
