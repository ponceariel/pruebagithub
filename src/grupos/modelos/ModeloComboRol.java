package grupos.modelos;

import autores.modelos.*;
import javax.swing.DefaultComboBoxModel;

public class ModeloComboRol extends DefaultComboBoxModel{

    public ModeloComboRol() {
        for (Rol rol : Rol.values()) {
            this.addElement(rol);
        }
    }
    
    public Rol obtenerRol() {
        return (Rol)this.getSelectedItem();
    }
    
    public void seleccionarRol (Rol rol) {
        this.setSelectedItem(rol);
    }
}
