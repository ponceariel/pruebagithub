/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Tipo {
 private String nombre;
//aqui se agrega el constructor
    public Tipo(String nombre) {
        this.nombre = nombre;
    }
 
//aqui se agregan los metodos get y set para cada atributo
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    //Aqui hago el metodo mostrar tipo (punto c)
    
    public void mostrartipo()
    {
        System.out.println(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    // aca voy a definir los metodos equals y hashcode para la clase tipo

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
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
   
}
