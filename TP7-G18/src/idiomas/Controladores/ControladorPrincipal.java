/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.Controladores;



import Interfaces.IControladorIdiomas;
import Interfaces.IControladorPrincipal;
import idiomas.vistas.VentanaPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class ControladorPrincipal implements IControladorPrincipal {
    
    private VentanaPrincipal autor;

    public ControladorPrincipal() {
        this.autor= new VentanaPrincipal(this);
        this.autor.setLocationRelativeTo(null);
        this.autor.setVisible(true);
    }

    public void btnIdiomasClic(ActionEvent evt) {
      IControladorIdiomas ventanaI=new ControladorIdiomas();
    }

    @Override
    public void btnSalirClic(ActionEvent evt) 
    {
       String botones[]={"Si","No"};
       int opcion = JOptionPane.showOptionDialog(null,CONFIRMACION,null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,this);
       if(opcion==JOptionPane.YES_OPTION){
           System.exit(0);
        }
    }




    
}
