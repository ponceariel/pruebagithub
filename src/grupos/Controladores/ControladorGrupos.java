/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.Controladores;

import grupos.modelos.Grupo;
import grupos.modelos.ModeloTablaGrupos;
import grupos.vistas.VentanaAMGrupo;
import grupos.vistas.VentanaGrupo;
import interfaces.IControladorGrupos;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willz
 */
public class ControladorGrupos implements IControladorGrupos{

   private VentanaGrupo ventana;
   private VentanaAMGrupo ventana1; 
    public ControladorGrupos () {
        this.ventana = new VentanaGrupo(this ,null, true);
         ventana.getTablaGrupos().setModel(new ModeloTablaGrupos());
        this.ventana.ModificarBorrar();
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
//        this.actualizar();
    }
    @Override
    public void btnNuevoClic(ActionEvent evt) {
        ControladorAMGrupos nuevoGrupo= new ControladorAMGrupos();
    }

    @Override
    public void btnModificarClic(ActionEvent evt) {
         ControladorAMGrupos controlador = new ControladorAMGrupos("Modificar Grupo", true, this.ventana.getGrupo(), this.ventana, true);
    
    }

    @Override
    public void btnBorrarClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }

    @Override
    public void btnBuscarClic(ActionEvent evt) {
         ModeloTablaGrupos mtp= (ModeloTablaGrupos) this.ventana.getTablaGrupos().getModel();
        mtp.actualizar();
        String nombre=this.ventana.getNombreTxt().getText();
        List<Grupo> Grupo_buscar= new ArrayList<>();
        
        if(nombre.isEmpty()){
            mtp.actualizar();
        }else{
            
            int filaP=mtp.getRowCount();
            for(int i=0;i<filaP;i++){
                
                Grupo grup=mtp.verGrupoSeleccionar(i);
                
                if(grup.verNombre().contains(nombre)){
                    Grupo_buscar.add(grup);
                }
            }
               mtp.setNombreFilas(Grupo_buscar);
               mtp.fireTableDataChanged();  
               
        } 
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        this.actualizar();
    }

    @Override
    public void txtNombrePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }
   public void actualizar(){
        ModeloTablaGrupos mtg = (ModeloTablaGrupos)this.ventana.getTablaGrupos().getModel();
        mtg.actualizar();
        this.ventana.gruposCargados();
    }
}

