/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Idioma {
   private String nombre;
//aqui se agrega el constructor
    public Idioma(String nombre) {
        this.nombre = nombre;
    }
//aqui se agrega los metodos get y set
    public String verNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Idioma{" + "nombre=" + nombre + '}';
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
  //aqui hago el metodo para mostrar el idioma (punto c)
    public void mostraridioma(){
        System.out.println(nombre);
    }
    
    //aqui voy a definir los metodos equals y hashcode para la clase idiomas

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Idioma other = (Idioma) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}
