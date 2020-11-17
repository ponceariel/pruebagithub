
package autores.modelos;


import java.util.ArrayList;

public abstract class Autor {
    
    private int DNI;
    private String apellidos;
    private String nombres;
    private String Clave;
   
    
    public  Autor(int DNI, String apellidos, String nombres, String Clave) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.Clave = Clave;
    }
    
    public void mostrar()
    {
      System.out.println("["+""+DNI+"]"+""+apellidos+","+""+nombres);
      
    }
  
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    @Override
    public String toString() {
        return "Autor{" + "DNI=" + DNI + ", apellidos=" + apellidos + ", nombres=" + nombres + ", Clave=" + Clave + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.DNI;
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
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        else 
        {
        final Autor other = (Autor) obj;
        if (this.DNI != other.getDNI()) {
            return false;
        }
        return true;
    }
    
    
    }
}
