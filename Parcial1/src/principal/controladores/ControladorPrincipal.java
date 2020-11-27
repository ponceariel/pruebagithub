/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import Interfaces.IControladorAutores;
import Interfaces.IControladorPrincipal;
import autores.controladores.ControladorAMAutores;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.vistas.VentanaPrincipal;

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

    @Override
    public void btnAutoresClic(ActionEvent evt) {
      ControladorAMAutores ventana=new ControladorAMAutores();
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
