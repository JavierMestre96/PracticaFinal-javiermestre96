import javax.swing.*;
import java.awt.*;

public class VentanaOpciones extends JDialog {
    ListaHerramienta lista = new ListaHerramienta();
    String tipoHerramienta = lista.tipoHerramienta();

    VentanaOpciones(){
        setLayout(new BorderLayout());
        if (tipoHerramienta.equals("ELECTRICA")){
            setTitle("Panel de herramienta eléctrica");
            add(new PanelHerramientaElectrica(), BorderLayout.CENTER);
        }else{
            setTitle("Panel de herramienta manual");
            add(new PanelHerramientaManual(),BorderLayout.CENTER);
        }
        setResizable(false);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        VentanaOpciones ventana = new VentanaOpciones();
    }
}
