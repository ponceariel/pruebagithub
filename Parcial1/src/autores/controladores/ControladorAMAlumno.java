
package autores.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import autores.modelos.GestorAutores;
import Interfaces.IControladorAMAlumno;
import Interfaces.IControladorAutores;
import autores.modelos.Autor;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAutores;
import java.util.ArrayList;



public class ControladorAMAlumno implements IControladorAMAlumno{

    private VentanaAMAlumno ventanaA;
    private VentanaAutores ventana;
    ArrayList<Autor> nombreFilas=new ArrayList<>();
    public ControladorAMAlumno() { 
        this.ventanaA = new VentanaAMAlumno(this,null,true);
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
        GestorAutores ga= GestorAutores.crear();
        System.out.println(ga.nuevoAutor(dni,apellido, nombre, cx, clave, claveRepetida));
       
       
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
