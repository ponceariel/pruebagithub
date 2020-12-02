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
import Interfaces.IControladorPrincipal;
import Interfaces.IGestorAutores;
import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.GestorAutores;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesores;
import autores.modelos.Profesor;
import autores.vistas.ModeloComboCargo;
import autores.vistas.VentanaAutores;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.TableModel;
import principal.controladores.ControladorPrincipal;

/**
 *
 * @author usuario
 */
public class ControladorAMAutores implements IControladorAutores{
    
    private VentanaAutores ventana;
//    private int bandera=1;


    public ControladorAMAutores() {

        this.ventana = new VentanaAutores(this,null,true);
        ventana.setLocationRelativeTo(null);
        ventana.getTablaProfesores().setModel(new ModeloTablaProfesores());
        ventana.getTablaAlumnos().setModel(new ModeloTablaAlumnos());
        ventana.setVisible(true);//se hace visible la ventana
    }


    public void setVentana(VentanaAutores ventana) {
        this.ventana = ventana;
    }

//    public int getBandera() {
//        return bandera;
//    }
    

    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) { 
      
      IControladorAMProfesor cp =new ControladorAMProfesor();
      ModeloTablaProfesores modeloT_Profesor= (ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
      modeloT_Profesor.actualizar(); 
      
      
    }

    @Override
    public void btnNuevoAlumnoClic(ActionEvent evt) {
       IControladorAMAlumno ca=new ControladorAMAlumno();
       ModeloTablaAlumnos modeloT_Alumno= (ModeloTablaAlumnos)this.ventana.getTablaProfesores().getModel();
       modeloT_Alumno.actualizar(); 
    } 

    @Override
    public void btnModificarProfesorClic(ActionEvent evt) {
 
    ModeloTablaProfesores mtp=(ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
    Profesor p= mtp.verProfesor(this.ventana.getTablaProfesores().getSelectedRow());
     IControladorAMProfesor controlador = new ControladorAMProfesor("Modificar Profesor", false, false, p);
     this.ventana.setVisible(false);
     this.ventana.dispose();
    }

    @Override
    public void btnModificarAlumnoClic(ActionEvent evt) {
    ModeloTablaAlumnos mtp=(ModeloTablaAlumnos)this.ventana.getTablaAlumnos().getModel();
    Alumno a= mtp.verAlumnosSeleccionar(this.ventana.getTablaAlumnos().getSelectedRow());
    IControladorAMAlumno caa=new ControladorAMAlumno("Modificar Alumno",false,false,a);
    mtp.actualizar();
    }

    @Override
    public void btnBorrarProfesorClic(ActionEvent evt) {
    ModeloTablaProfesores mtp=(ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
    Profesor p= mtp.verProfesor(this.ventana.getTablaProfesores().getSelectedRow());
    GestorAutores gp= GestorAutores.crear();
    gp.verProfesores().remove(p);
    mtp.actualizar();
   
    }

    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {
    ModeloTablaAlumnos mtp=(ModeloTablaAlumnos)this.ventana.getTablaAlumnos().getModel();
    Alumno a= mtp.verAlumnosSeleccionar(this.ventana.getTablaAlumnos().getSelectedRow());
    GestorAutores gp= GestorAutores.crear();
    gp.verAlumnos().remove(a);
    mtp.actualizar();
      
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
    this.ventana.dispose();    
    IControladorPrincipal Cprincipal=new ControladorPrincipal();
    }

    @Override
    public void btnBuscarProfesorClic(ActionEvent evt) {
       
        ModeloTablaProfesores mtp= (ModeloTablaProfesores) this.ventana.getTablaProfesores().getModel();
        mtp.actualizar();
        String apellido=this.ventana.getTxtApellidosProfesor().getText();
        ArrayList<Profesor> profesor_buscar= new ArrayList<>();
        
        if(apellido.isEmpty()){
            mtp.actualizar();
        }else{
            
            int filaP=mtp.getRowCount();
            for(int i=0;i<filaP;i++){
                
                Profesor Prof=mtp.verProfesor(i);
                
                if(Prof.getApellidos().contains(apellido)){
                    profesor_buscar.add(Prof);
                }
            }
               mtp.setNombreFilas(profesor_buscar);
               mtp.fireTableDataChanged();  
               
        } 
        
    }
    @Override
    public void btnBuscarAlumnoClic(ActionEvent evt) {
       
       ModeloTablaAlumnos mta= (ModeloTablaAlumnos) this.ventana.getTablaAlumnos().getModel();
        mta.actualizar();
        String apellido=this.ventana.getTxtApellidosAlumnos().getText();
        ArrayList<Alumno> alumno_buscar= new ArrayList<>();
        
        if(apellido.isEmpty()){
            mta.actualizar();
        }else{
            
            int filaAL=mta.getRowCount();
            for(int i=0;i<filaAL;i++){
                
                Alumno alum=mta.verAlumnosSeleccionar(i);
                
                if(alum.getApellidos().contains(apellido)){
                    alumno_buscar.add(alum);
                }
            }
               mta.setNombreFilas(alumno_buscar);
               mta.fireTableDataChanged();
             
        }
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        
    }

    @Override
    public void txtApellidosProfesorPresionarTecla(KeyEvent evt) {
     char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c))
         evt.consume();        
    }

    @Override
    public void txtApellidosAlumnoPresionarTecla(KeyEvent evt) {
         char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c))
         evt.consume();        
    }

    
    
    
}
