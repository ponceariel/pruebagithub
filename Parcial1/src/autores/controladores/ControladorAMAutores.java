/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.controladores;

import Interfaces.IControladorAMAlumno;
import Interfaces.IControladorAMProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import Interfaces.IControladorAutores;
import autores.modelos.GestorAutores;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesores;
import autores.vistas.VentanaAutores;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class ControladorAMAutores implements IControladorAutores{
    
    private VentanaAutores ventana;

    public ControladorAMAutores() {
        this.ventana = new VentanaAutores(this,null,true);
        ventana.setVisible(true);//se hace visible la ventana
        ventana.setLocationRelativeTo(null);
        ventana.getTablaProfesores();
        ventana.getTablaAlumnos();
        ModeloTablaAlumnos mta=(ModeloTablaAlumnos)this.ventana.getTablaAlumnos().getModel();
        mta.actualizar();
        
    }


    public void setVentana(VentanaAutores ventana) {
        this.ventana = ventana;
    }
    

    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) {
      IControladorAMProfesor cp =new ControladorAMProfesor();
      
    }

    @Override
    public void btnNuevoAlumnoClic(ActionEvent evt) {
    IControladorAMAlumno ca=new ControladorAMAlumno();
    }

    @Override
    public void btnModificarProfesorClic(ActionEvent evt) {
    
    }

    @Override
    public void btnModificarAlumnoClic(ActionEvent evt) {
       
    }

    @Override
    public void btnBorrarProfesorClic(ActionEvent evt) {
   
    }

    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {

    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
   
    }

    @Override
    public void btnBuscarProfesorClic(ActionEvent evt) {
       
    }

    @Override
    public void btnBuscarAlumnoClic(ActionEvent evt) {

    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        
    }

    @Override
    public void txtApellidosProfesorPresionarTecla(KeyEvent evt) {

    }

    @Override
    public void txtApellidosAlumnoPresionarTecla(KeyEvent evt) {
 
    }
    
}
