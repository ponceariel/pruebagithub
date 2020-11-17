
package autores.modelos;


public class Profesor extends Autor {
   
    private Cargo cargo;

//aqui se agrega el constructor 
    public Profesor( int DNI, String apellidos, String nombres, String Clave,Cargo cargo) {
        
        super(DNI, apellidos, nombres, Clave);
        this.cargo = cargo;
     
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("\t"+","+"cargo: "+ this.cargo);
        System.out.println("\n");
    }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
       return super.toString() + "cargo=" + cargo + '}';
    }
   
   }
  