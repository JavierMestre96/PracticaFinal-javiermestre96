import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PanelHerramienta {
    ListaHerramienta lista = new ListaHerramienta();
    private Ventana ventana = new Ventana();
    private Panel panel = new Panel();
    private JButton crear = new JButton("Añadir herramienta");

    PanelHerramienta(){
        ventana.setLayout(new BorderLayout());
        ventana.add(panel,BorderLayout.CENTER);
        ventana.add(crear, BorderLayout.SOUTH);
        ventana.pack();
        ventana.setVisible(true);

        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    String nombreHerramienta = panel.getNombreH().getText();
                    double precioHerramienta = Double.parseDouble(panel.getPrecioH().getText())/100;
                    System.out.println(precioHerramienta);
                    if(nombreHerramienta.isEmpty()){
                        throw new IOException("ERROR");
                    }
                    JOptionPane.showMessageDialog(null,"La herramienta "+nombreHerramienta+" con el precio "+precioHerramienta+" € ha sido creada correctamente. ");
                    ventana.dispose();
                }catch (NullPointerException npe){
                    JOptionPane.showMessageDialog(null,"ERROR");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"No debe haber ningún campo vacio");
                }
                catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"Introduce un precio VÁLIDO");
                }

            }
        });
    }
}
