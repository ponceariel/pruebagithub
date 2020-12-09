/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.controladores.ControladorAutores;
import grupos.Controladores.ControladorGrupos;
import interfaces.IControladorPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import principal.vistas.VentanaPrincipal;
import publicaciones.modelos.ControladorAMPublicaciones;

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
      ControladorAutores ventana=new ControladorAutores();
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

    @Override
    public void btnPalabrasClavesClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnLugaresClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnIdiomasClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnTiposClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnGruposClic(ActionEvent evt) {
        ControladorGrupos ventanaGrupo= new ControladorGrupos();
    }

    @Override
    public void btnPublicacionesClic(ActionEvent evt) {
        ControladorAMPublicaciones p= new ControladorAMPublicaciones();
    }


    
}
