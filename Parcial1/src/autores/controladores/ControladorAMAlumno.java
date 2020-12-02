
package autores.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import autores.modelos.GestorAutores;
import Interfaces.IControladorAMAlumno;
import Interfaces.IControladorAutores;
import autores.modelos.Autor;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.Profesor;
import autores.vistas.ModeloComboCargo;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import autores.vistas.VentanaAutores;
import java.util.ArrayList;
import javax.swing.JComboBox;



public class ControladorAMAlumno implements IControladorAMAlumno{

    private VentanaAMAlumno ventanaA;
    private VentanaAutores ventana;
    ArrayList<Autor> nombreFilas=new ArrayList<>();
    private Autor autorAux;
    private boolean crear;
    
    public ControladorAMAlumno() { 
        this.ventanaA = new VentanaAMAlumno(this,null,true);
        this.ventanaA.setLocationRelativeTo(null);
        this.ventanaA.setVisible(true);
    }
     public ControladorAMAlumno(String title, boolean dniEnabled, boolean crear, Autor autor){
        this.crear=crear;
        this.ventanaA = new VentanaAMAlumno(this,null,true);
        this.ventanaA.setTitle(title);
        this.ventanaA.dniEnabledA(dniEnabled);
        this.ventanaA.setDni(String.valueOf(autor.getDNI()));
        this.ventanaA.setNombres((autor.getNombres()));
        this.autorAux = autor;
        this.ventanaA.setLocationRelativeTo(null);
        this.ventanaA.setVisible(true);
    }
    @Override
    public void btnGuardarClic(ActionEvent evt){
        int dni=Integer.parseInt(this.ventanaA.getTxt_Documento().getText());
        String apellido=this.ventanaA.getTxt_Apellido().getText();
        String nombre=this.ventanaA.getTxt_Nombre().getText();
        String clave=this.ventanaA.getTxt_Clave().getText();
        String claveRepetida=this.ventanaA.getTxt_Repetir_Clave().getText();
        String cx=this.ventanaA.getTxt_CX().getText();
         if(this.ventanaA.getTxt_Documento().isEnabled()){
         GestorAutores ga= GestorAutores.crear();
         System.out.println(ga.nuevoAutor(dni,apellido, nombre, cx, clave, claveRepetida));
         }else
         {
         GestorAutores ga= GestorAutores.crear();
         System.out.println(ga.modificarAutor(autorAux, apellido, nombre, cx, clave, claveRepetida));
         }
       
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
    IControladorAutores cal=new ControladorAMAutores();
    }

    public void txtApellidosPresionarTecla(KeyEvent evt) {
         char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c)&&!Character.isWhitespace(c))
         evt.consume();        
    }

    public void txtNombresPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isAlphabetic(c) && !Character.isWhitespace(c))
         evt.consume();
    }

    public void txtDocumentoPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c))
         evt.consume();
    }

    public void passClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }

    public void passRepetirClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }

    public void txtCXPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c))
         evt.consume();
    }
}
