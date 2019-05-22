import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class Panel extends JPanel {
    private JLabel marcaHerramienta = new JLabel("Marca de la herramienta: ");
    private JFormattedTextField marcaH = new JFormattedTextField("");
    private JLabel nombreHerramienta = new JLabel("Nombre de la herramienta: ");
    private JFormattedTextField nombreH = new JFormattedTextField("");
    private JLabel precioHerramienta = new JLabel("Precio de la Herramienta: ");
    private JFormattedTextField precioH = new JFormattedTextField("");
    private JLabel descripcionHerramienta = new JLabel("Descripcion de la Herramienta: ");
    private JTextArea descripcionH = new JTextArea("");
    protected JPanel panelEtiquetas = new JPanel();

    Panel(){
        panelEtiquetas.setLayout(new GridLayout(0,2));
        panelEtiquetas.add(marcaHerramienta);
        panelEtiquetas.add(marcaH);
        panelEtiquetas.add(nombreHerramienta);
        panelEtiquetas.add(nombreH);
        panelEtiquetas.add(descripcionHerramienta);
        panelEtiquetas.add(descripcionH);
        panelEtiquetas.add(precioHerramienta);
        panelEtiquetas.add(precioH);
        setLayout(new BorderLayout());
        add(panelEtiquetas,BorderLayout.CENTER);
    }

    public JFormattedTextField getMarcaH(){
        return this.marcaH;
    }
    public JFormattedTextField getNombreH(){
        return this.nombreH;
    }
    public JTextArea getDescripcionH(){
        return this.descripcionH;
    }
    public JFormattedTextField getPrecioH(){
        return this.precioH;
    }

}
