/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Lugar {
 private String nombre;
//aqui se agrega el constructor
    public Lugar(String nombre) {
        this.nombre = nombre;
    }
//aqui se agrega los metodos get y set
    public String verNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + '}';
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    //aqui hago el metodo de mostrar lugar (punto c)
    public void mostrarlugar(){
        System.out.println(nombre);
    }
    
    //aqui voy a definir los metodos equals y hashcode para la clase LUGAR

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
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
        final Lugar other = (Lugar) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
    
}
