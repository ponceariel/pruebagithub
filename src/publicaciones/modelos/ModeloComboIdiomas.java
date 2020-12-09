/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import Interfaces.IGestorIdiomas;
import autores.modelos.Cargo;
import idiomas.modelos.GestorIdiomas;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import parcial2.g18.Parcial2G18;

/**
 *
 * @author Ariel Ponce
 */
public class ModeloComboIdiomas extends DefaultComboBoxModel{
    IGestorIdiomas gi=GestorIdiomas.crear();
    public ModeloComboIdiomas() {
        gi.nuevoIdioma("ingles");
        gi.nuevoIdioma("español");
        
        for(Idioma i: gi.verIdiomas() )
        {
           this.addElement(i);
        }
    }
    
   public Idioma obtenerIdioma(){
        return (Idioma)this.getSelectedItem();
    }
    public void seleccionarIdioma(Idioma idioma){
        this.setSelectedItem(idioma);
    } 
    
}
    

