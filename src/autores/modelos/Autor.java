
package autores.modelos;


import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.List;

public abstract class Autor {
    
    private int DNI;
    private String apellidos;
    private String nombres;
    private String Clave;
    private List<MiembroEnGrupo> miembroEnGrupos = new ArrayList<>();
    
    public  Autor(int DNI, String apellidos, String nombres, String Clave) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.Clave = Clave;
    }
    
//    public void mostrar()
//    {
//      System.out.println("["+""+DNI+"]"+""+apellidos+","+""+nombres);
//      
//    }
    public List<Grupo> mostrarGrupos(){
        List<Grupo> grupos = new ArrayList<> ();
        for (MiembroEnGrupo meg : miembroEnGrupos) {
            grupos.add(meg.getGrupos());
        }
        return grupos;
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
    public Rol devolverRol(){
       MiembroEnGrupo m = null;
       
      return m.getRol();
   }
    @Override
    public String toString() {
        return "Autor{" + "DNI=" + DNI + ", apellidos=" + apellidos + ", nombres=" + nombres + ", Clave=" + Clave + '}';
    }

     public void agregarGrupo (Grupo grupo, Rol rol) {
        for (MiembroEnGrupo meg : miembroEnGrupos) {
            if(meg.getGrupos().equals(grupo)){
                return;
            }
        }
        miembroEnGrupos.add(new MiembroEnGrupo(this, grupo, rol));
        grupo.agregarMiembro(this, rol);
    }
  
      public void quitarGrupo (Grupo grupo) {
        for (MiembroEnGrupo meg : miembroEnGrupos) {
            if(meg.getGrupos().equals(grupo)){
                miembroEnGrupos.remove(meg);
                grupo.quitarMiembro(this);
            }
        }
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
     public Rol verRol(Autor autor, Grupo grupo){
        for(MiembroEnGrupo meg : miembroEnGrupos){
            if(autor.equals(meg.getAutor()) && grupo.equals(meg.getAutor())){
                return meg.getRol();
            }
        }
        return null;
    }
}
