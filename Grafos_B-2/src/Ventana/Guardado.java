// clase para guardar y abrir los proyectos que se realicen en jgrafos
package Ventana;
import java.util.ArrayList;
import Grafos.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Guardado extends JFrame{
    private Grafos DatosGrafo;
    
    public Guardado(){
        DatosGrafo = new Grafos();
        JFileChooser GuardarArchivo = new JFileChooser();
        GuardarArchivo.setApproveButtonText("Guardar");
        GuardarArchivo.showSaveDialog(null);
        File archivoGrafos = new File(GuardarArchivo.getSelectedFile() + ".txt");
        DatosGrafo = FRAME.nuevo;
        try{
            if(!archivoGrafos.exists()){
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivoGrafos));
            salida.write(DatosGrafo.nAristaC + "\n");
            salida.append( DatosGrafo.getArista() + "\n");
            salida.append((char) DatosGrafo.getnAristaC() + "\n");
            salida.append(Grafos.nodo + "\n");
            salida.append( Grafos.ArrayL + "\n");
            salida.append( Grafos.getNodo() + "\n");
            salida.append( Grafos.getMatriz()+ "\n");
            salida.append( Grafos.getDimSide() + "\n");
            salida.append( Grafos.getTamano() + "\n");
            salida.append( Grafos.getConta() + "\n");
            salida.append( Grafos.getContadorLineas() + "\n");
            salida.append( Grafos.getNodoTemp() + "\n");
            salida.append( Grafos.getNodos() + "\n");
            salida.append( Grafos.matriz + "\n");
            salida.append( Grafos.tamano + "\n");
            DatosGrafo.limpiar();
            FRAME.nuevo = DatosGrafo; 
            salida.close();
            }
            else{
            FileWriter fw = new FileWriter(archivoGrafos);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(DatosGrafo.nAristaC + "\n");
            bw.append( DatosGrafo.getArista() + "\n");
            bw.append((char) DatosGrafo.getnAristaC() + "\n");
            bw.append(Grafos.nodo + "\n");
            bw.append( Grafos.ArrayL + "\n");
            bw.append( Grafos.getNodo() + "\n");
            bw.append( Grafos.getMatriz()+ "\n");
            bw.append( Grafos.getDimSide() + "\n");
            bw.append( Grafos.getTamano() + "\n");
            bw.append( Grafos.getConta() + "\n");
            bw.append( Grafos.getContadorLineas() + "\n");
            bw.append( Grafos.getNodoTemp() + "\n");
            bw.append( Grafos.getNodos() + "\n");
            bw.append( Grafos.matriz + "\n");
            bw.append( Grafos.tamano + "\n");
            DatosGrafo.limpiar();
            FRAME.nuevo = DatosGrafo; 
            
            bw.close();
            }

            
            
            
        }catch(IOException e){
            
        }

        
 
            }
    
}
