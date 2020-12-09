/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.GestorGrupos;
import grupos.modelos.Grupo;
import interfaces.IGestorGrupos;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Ariel Ponce
 */
public class ModeloComboGrupo extends DefaultComboBoxModel {
    IGestorGrupos gg=GestorGrupos.crear();
    public ModeloComboGrupo() {
        
        for(Grupo g: gg.verGrupos() )
        {
           this.addElement(g);
        }
    }
    
    public Grupo obtenerGrupo(){
        return (Grupo)this.getSelectedItem();
    }
    public void seleccionarGrupo(Grupo grupo){
        this.setSelectedItem(grupo);
    } 
    
}
