
package autores.vistas;

import autores.modelos.Cargo;
import javax.swing.DefaultComboBoxModel;


public class ModeloComboCargo extends DefaultComboBoxModel{

    public ModeloComboCargo() {
        
        for(Cargo Cargo: Cargo.values())
        {
           this.addElement(Cargo);
        }
    }
    
   public Cargo obtenerCargo(){
        return (Cargo)this.getSelectedItem();
    }
    public void seleccionarCargo(Cargo cargo){
        this.setSelectedItem(cargo);
    } 
    
}

