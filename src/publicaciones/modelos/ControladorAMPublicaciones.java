
package publicaciones.modelos;

import Interfaces.IGestorPublicaciones;
import autores.modelos.GestorAutores;
import autores.modelos.ModeloTablaProfesores;
import autores.modelos.Profesor;
import interfaces.IControladorPublicaciones;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import principal.controladores.ControladorPrincipal;
import publicaciones.vistas.VentanaAMPublicacion;


public class ControladorAMPublicaciones implements IControladorPublicaciones{
    
    VentanaAMPublicacion ventana;

    public ControladorAMPublicaciones() {
        this.ventana= new VentanaAMPublicacion(this,null,true);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }

    @Override
    public void btnNuevaClic(ActionEvent evt) {
        ControladorPublicaciones cp= new ControladorPublicaciones();
    }

    @Override
    public void btnModificarClic(ActionEvent evt) {
         ControladorPublicaciones cp= new ControladorPublicaciones();
    }

    @Override
    public void btnBorrarClic(ActionEvent evt) {
      ModeloTablaPublicaciones mtp=(ModeloTablaPublicaciones)this.ventana.getTablapublicaciones().getModel();
      Publicacion p= mtp.verPublicacionesSeleccionar(this.ventana.getTablapublicaciones().getSelectedRow());
      IGestorPublicaciones gp= GestorPublicaciones.crear();
      gp.verPublicaciones().remove(p);
      mtp.actualizar();
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
        ControladorPrincipal p= new ControladorPrincipal();
    }

    @Override
    public void btnBuscarClic(ActionEvent evt) {
         ModeloTablaPublicaciones mtp=(ModeloTablaPublicaciones)this.ventana.getTablapublicaciones().getModel();
         mtp.actualizar();
         String Titulo=this.ventana.getTituloTxt().getText();
         List<Publicacion> publicaciones=new ArrayList<>();
         if(Titulo.isEmpty()){
             mtp.actualizar();
         }else{
             int filap=mtp.getRowCount();
             for(int i=0;i<filap;i++){
                 Publicacion pub=mtp.verPublicacionesSeleccionar(filap);
              if(pub.getTitulo().contains(Titulo)){
                  publicaciones.add(pub);
              }
             }
              mtp.setNombreFilas((ArrayList<Publicacion>) publicaciones);
              mtp.fireTableDataChanged();
         }
    }


    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
     ModeloTablaPublicaciones mtp=(ModeloTablaPublicaciones)this.ventana.getTablapublicaciones().getModel();
     mtp.actualizar();
        
    }

    @Override
    public void txtTituloPresionarTecla(KeyEvent evt) {
            char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c))
         evt.consume();        
      
    }
    
    

    
}
