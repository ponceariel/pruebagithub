/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.Controladores;

import grupos.modelos.GestorGrupos;
import grupos.modelos.Grupo;
import grupos.modelos.ModeloTablaGrupos;
import grupos.modelos.ModeloTablaMiembrosGrupo;
import grupos.modelos.ModeloTablaModificarGrupo;
import grupos.vistas.VentanaAMGrupo;
import interfaces.IControladorAMGrupo;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;

/**
 *
 * @author willz
 */
public class ControladorAMGrupos implements IControladorAMGrupo{

  private VentanaAMGrupo ventana;
    private Grupo grupAux;
    private GestorGrupos gg=GestorGrupos.crear();
    private Boolean aux;
    
    
    public ControladorAMGrupos(){
        
         this.ventana = new VentanaAMGrupo(this,null,true,null);
        ventana.setLocationRelativeTo(null);
        this.ventana.modificarEnabled(false, null);
        ventana.setVisible(true);//se hace visible la ventana
    }
    public ControladorAMGrupos(String title, boolean modificarEnabled, Grupo grupo, JDialog padre, boolean modal){
        this.grupAux = grupo;
        this.ventana = new VentanaAMGrupo(this, padre, modal,grupo);
        this.ventana.setTitle(title);
        this.ventana.modificarEnabled(modificarEnabled, grupo);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
   
    @Override
    public void txtNombrePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }

    @Override
    public void btnGuardarClic(ActionEvent evt) {
        String nombre=this.ventana.getNombreGrupo().getText();
        String descripcion=this.ventana.getDescripcionGrupo().getText();
        if(this.ventana.getNombreGrupo().isEnabled()){
         GestorGrupos ga= GestorGrupos.crear();
         System.out.println(ga.nuevoGrupo(nombre,descripcion));
         this.ventana.setVisible(false);
         this.ventana.dispose();
        }else{
           GestorGrupos gm= GestorGrupos.crear(); 
           System.out.println(gm.modificarGrupo(grupAux, descripcion));
           this.ventana.setVisible(false);
           this.ventana.dispose();
        }
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }

    @Override
    public void btnModificarMiembrosClic(ActionEvent evt) {
         ControladorModificarGrupo grupo=new ControladorModificarGrupo(grupAux,this.ventana, true);
    }

    @Override
    public void txtDescripcionPresionarTecla(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        ModeloTablaMiembrosGrupo mtmg = (ModeloTablaMiembrosGrupo)this.ventana.getTablaMiembrosGrupos().getModel();
        mtmg.actualizar();
    }
}
