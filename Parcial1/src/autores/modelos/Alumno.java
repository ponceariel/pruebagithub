/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Alumno extends Autor{
   
    private String Cx;
//aqui se agrega el constructor
    public Alumno(int dni, String apellidos, String nombres, String Clave, String Cx) {
        
        super(dni, apellidos, nombres, Clave);
        this.Cx = Cx;
    }
    
    @Override
     public void mostrar() {
         
         super.mostrar();
         System.out.println(","+"CX: "+Cx);
         System.out.println("\n");
    }
@Override
    public int hashCode() {
        return super.hashCode() + Objects.hashCode(this.Cx);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            if (obj instanceof Alumno) {
                return Objects.equals(this.Cx, ((Alumno)obj).getCx());
            }
            else {
                return false;
            }
        }
        return true;
    }       

    @Override
    public String toString() {
      return  super.toString()  + "Cx=" + Cx + '}';
    }

    
     

    public String getCx() {
        return Cx;
    }

    public void setCx(String Cx) {
        this.Cx = Cx;
    }

   
  
}
