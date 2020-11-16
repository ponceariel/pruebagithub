/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.controladores;

import autores.vistas.VentanaAMProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import autores.modelos.GestorAutores;
import Interfaces.IControladorAMProfesor;
import Interfaces.IControladorAutores;
import autores.modelos.Cargo;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesores;
import autores.vistas.ModeloComboCargo;
import autores.vistas.VentanaAutores;

/**
 *
 * @author willz
 */
public class ControladorAMProfesor implements IControladorAMProfesor{
    
    private VentanaAMProfesor ventanaP;
    private VentanaAutores ventana;
    
    public ControladorAMProfesor() {
        this.ventanaP = new VentanaAMProfesor(this,null,true);
        this.ventanaP.setLocationRelativeTo(null);
        JComboBox comboCargo = new JComboBox();
        comboCargo.setModel(new ModeloComboCargo());
        this.ventanaP.getComboBox_Cargo().setModel(new ModeloComboCargo());
        this.ventanaP.setVisible(true);
    }
    @Override
    public void btnGuardarClic(ActionEvent evt){
        int dni=Integer.parseInt(this.ventanaP.getTxt_Documento().getText());
        String apellido=this.ventanaP.getTxt_Apellido().getText();
        String nombre=this.ventanaP.getTxt_Nombre().getText();
        String clave=this.ventanaP.getTxt_Clave().getText();
        String claveRepetida=this.ventanaP.getTxt_Repetir_Clave().getText();
        Cargo cargo=((ModeloComboCargo)this.ventanaP.getComboBox_Cargo().getModel()).obtenerCargo();
        GestorAutores gp= GestorAutores.crear();
        gp.nuevoAutor(dni, apellido, nombre, cargo, clave, claveRepetida);
        ModeloTablaProfesores modeloT_Profesor= (ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
        modeloT_Profesor.actualizar();
      
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtApellidosPresionarTecla(KeyEvent evt) {
         char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c)&&!Character.isWhitespace(c))
         evt.consume();        
    }

    @Override
    public void txtNombresPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isAlphabetic(c) && !Character.isWhitespace(c))
         evt.consume();
    }

    @Override
    public void txtDocumentoPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c))
         evt.consume();
    }

    @Override
    public void passClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }

    @Override
    public void passRepetirClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }
   
}
