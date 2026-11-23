// clase para guardar y abrir los proyectos que se realicen en jgrafos
package Ventana;
import java.util.ArrayList;
import Grafos.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Abrir extends JFrame {
    private JTextField NombreArchivo;
    private JTextArea Direccion;
    private JPanel Panel;
    
    
    public Abrir(){
        setLocationRelativeTo(null);
        setSize(700, 500);
        setLayout(null);
        Panel = new JPanel();
        NombreArchivo = new JTextField();
        Panel.setLayout(null);
        setContentPane(Panel);
        Direccion = new JTextArea();
                JFileChooser fc = new JFileChooser();
                //Creamos el filtro
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt");
                //Le indicamos el filtro
                fc.setFileFilter(filtro);
                //Component contentPane = null;
                //se guarda la opcion seleccionada por el usuario
                int opSeleccionada = fc.showOpenDialog(Panel);
                if(opSeleccionada == JFileChooser.APPROVE_OPTION){
                    File fichero = fc.getSelectedFile();
                    //fichero = fc.set
                    NombreArchivo.setText(fichero.getAbsolutePath());
                    try(FileReader fr=new FileReader(fichero)){
                        String cadena="";
                        int valor=fr.read();
                        while(valor!=-1){
                            cadena=cadena+(char)valor;
                            valor=fr.read();
                        }
                        Direccion.setText(cadena);
                    } 
                    catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } 
                else{
//                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                }
            }
    
}
