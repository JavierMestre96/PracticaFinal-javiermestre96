import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Panel extends JPanel {
    private JLabel nombreHerramienta = new JLabel("Nombre de la herramienta: ");
    private JFormattedTextField nombreH = new JFormattedTextField();
    private JLabel precioHerramienta = new JLabel("Precio de la Herramienta: ");
    private JFormattedTextField precioH = new JFormattedTextField(new Double(0));
    private JPanel panelEtiquetas = new JPanel();

    Panel(){
        panelEtiquetas.setLayout(new GridLayout(0,1));
        panelEtiquetas.add(nombreHerramienta);
        panelEtiquetas.add(nombreH);
        panelEtiquetas.add(precioHerramienta);
        panelEtiquetas.add(precioH);
        setLayout(new BorderLayout());
        add(panelEtiquetas,BorderLayout.CENTER);
    }

    public JFormattedTextField getNombreH(){
        return this.nombreH;
    }
    public JFormattedTextField getPrecioH(){
        return this.precioH;
    }

}
