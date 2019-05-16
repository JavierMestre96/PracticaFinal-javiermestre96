import javax.swing.*;
import java.awt.*;

public class PanelHerramientaElectrica extends Panel {

    JLabel potencia = new JLabel("Potencia en vatios: ");
    JTextField potenciaW = new JTextField(new Integer(0));


    PanelHerramientaElectrica(){

        panelEtiquetas.add(potencia);
        panelEtiquetas.add(potenciaW);

    }
}
