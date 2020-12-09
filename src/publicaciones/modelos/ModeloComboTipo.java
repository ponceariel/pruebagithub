/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import Interfaces.IGestorIdiomas;
import Interfaces.IGestorTipos;
import idiomas.modelos.GestorIdiomas;
import idiomas.modelos.Idioma;
import javax.swing.DefaultComboBoxModel;
import tipos.modelos.GestorTipos;
import tipos.modelos.Tipo;

/**
 *
 * @author Ariel Ponce
 */
public class ModeloComboTipo extends DefaultComboBoxModel{
     IGestorTipos gt=GestorTipos.crear();
    public ModeloComboTipo() {
        gt.nuevoTipo("Tecnologia");
        gt.nuevoTipo("Economia");
        gt.nuevoTipo("Salud");
        gt.nuevoTipo("Calentamiento Global");
        
        for(Tipo t: gt.verTipos() )
        {
           this.addElement(t);
        }
    }
    
    public Tipo obtenerTipo(){
        return (Tipo)this.getSelectedItem();
    }
    public void seleccionarTipo(Tipo tipo){
        this.setSelectedItem(tipo);
    } 
    
}
