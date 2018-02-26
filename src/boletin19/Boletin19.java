
package boletin19;
import com.david.libreria.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx=new Metodos();
        
        boolean opc=true;
        //int op=0;
        while(opc==true){
            int op=Integer.parseInt(JOptionPane.showInputDialog("***** MENÚ *****"
                    + "\n0.-Salir de la aplicación."
                    + "\n1.-Engadir libro."
                    + "\n2.-Vender libro."
                    + "\n3.-Amosar libros."
                    + "\n4.-Dar de baixa libro."
                    + "\n5.-Consultar un libro."));
            switch(op){
                case 0:
                    opc=false;
                    break;
                case 1:
                    obx.engadir();
                    break;
                case 2:
                    obx.venderBorarLibros();
                    break;
                case 3:
                    obx.amosar();
                    break;
                case 4:
                    obx.darDeBaixa();
                    break;
                case 5:
                    obx.consultarLibro();
                    break;
                default:
                    System.out.println("*** OPCIÓN NON CORRECTA ***");
            }
        }
    }
    
}
