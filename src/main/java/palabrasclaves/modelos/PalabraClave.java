/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class PalabraClave {
private String nombre; 
//aqui se agrega el constructor
    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }
//aqui se agregan los metodos get y set 
    
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    //Aqui hago el metodo mostrar palabraclave (punto c)
    public void mostrarpalabraclave(){
        System.out.println(nombre);
    }

    @Override
    public String toString() {
        return "PalabraClave{" + "nombre=" + nombre + '}';
    }
    
    //aqui voy a definir los metodos equals y hashcode para la clase palabras claves

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PalabraClave other = (PalabraClave) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
