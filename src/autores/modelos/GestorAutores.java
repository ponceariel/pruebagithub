
package autores.modelos;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import interfaces.IGestorAutores;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 
public class GestorAutores implements IGestorAutores {
    
    public static final String Autor_Correcto="Se creo con exito el nuevo Autor";
    public static final String Autor_Incorrecto="no se pudo crear el nuevo Autor";
    public static final String Autor_Repetido="esta repetido";    
    public static final String Descripcion_Cambio="se ha realizado un cambio en la informacion de  un actor";
     public static final String Autor_existente="Si existe este autor"; 
    
    private ArrayList<Autor> AUTORES= new ArrayList<>();
    private static GestorAutores auxiliar;
       private GestorAutores(){
        //aqui estoy definiendo un constructor predeterminado de gestortipo
    }
    
    public static GestorAutores crear(){
        if(auxiliar == null)
            auxiliar= new GestorAutores();
            return auxiliar;
        }
    
     @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cargo!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())&&(clave!=claveRepetida)){
            Autor profe=new Profesor(dni,apellidos,nombres,clave,cargo);
            
            if(!this.AUTORES.contains(profe)){
                this.AUTORES.add(profe);
                return Autor_Correcto;
            }
             else{
                 return Autor_Repetido;
            }   
        }else
             return Autor_Incorrecto;
    }
    
    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
       if((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cx!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())&&(clave!=claveRepetida)){
            Autor alumno=new Alumno(dni,apellidos,nombres,clave,cx);
            
            if(!this.AUTORES.contains(alumno)){
                this.AUTORES.add(alumno);
                return Autor_Correcto;
            }
             else{
                 return Autor_Repetido;
            }   
        }else
             return Autor_Incorrecto;
    }
    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
         
        autor.setApellidos(apellidos);
        autor.setClave(clave);
        autor.setNombres(nombres);
       
        return Descripcion_Cambio;
    }
    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        autor.setApellidos(apellidos);
        autor.setClave(clave);
        autor.setNombres(nombres);
        
       
        return Descripcion_Cambio;
    }
    @Override
    public boolean existeEsteAutor(Autor autor) {
     if(!this.AUTORES.contains(autor)){
         return false;
     }else
     System.out.println(Autor_existente);
     return true;
    }
    @Override
    public List<Autor> verAutores() {
        return AUTORES;
    }
    @Override
    public ArrayList<Profesor> verProfesores() { 
          ArrayList<Profesor> alumnos = new ArrayList<>();
        for(Autor a : AUTORES){
            if(a instanceof Profesor){
                alumnos.add((Profesor)a);
            }
        }
        return alumnos;
    }
    @Override
    public ArrayList<Alumno> verAlumnos() {    
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for(Autor a : AUTORES){
            if(a instanceof Alumno){
                alumnos.add((Alumno)a);
            }
        }
        return alumnos;
    }
    @Override
    public Autor verAutor(int dni) {
        
        Autor autordni=null;
        for(Autor a: this.AUTORES)
        {
            if( a.getDNI()==dni){
               
             autordni=a;
            }
                
        }
        return autordni;
    }
//    @Override
//    public String toString() {
//        return "GestorAutores{" + "AUTORES=" + AUTORES + ", PROFESORES=" + PROFESORES + ", ALUMNOS=" + ALUMNOS + '}';
//    }

    @Override
    public String borrarAutor(Autor autor) {
          for(Autor a : AUTORES){
            if(a.getDNI()== autor.getDNI()){
                AUTORES.remove(a);
                return "AUTOR BORRADO";
            }
        }
                      return "no existe el autor";

    }
    

    @Override
    public String agregarGrupos(Autor autor, List<MiembroEnGrupo> grupos) {
        for (MiembroEnGrupo meg: grupos){
           if(autor.equals(meg.getAutor())){
               autor.agregarGrupo(meg.getGrupos(), meg.getRol());
           }
       }
       return "Se agregaron los Grupos";
    }

    @Override
    public String quitarGrupos(Autor autor, List<MiembroEnGrupo> grupos) {
            for (MiembroEnGrupo meg: grupos){
           if(autor.equals(meg.getAutor())){
               autor.quitarGrupo(meg.getGrupos());
           }
       }
       return "Se eliminaron los grupos";
    }

    @Override
    public List<Profesor> buscarProfesores(String apellidos) {
         Comparator<Profesor> apellidoCmp = (p1, p2) -> {
            return p1.getApellidos().compareTo(p2.getApellidos());
        };
        
        Comparator<Profesor> nombreCmp = (p1, p2) -> {
            return p1.getNombres().compareTo(p2.getNombres());
        };
        
        List<Profesor> busquedaProfesores = new ArrayList<>();
        for(Profesor p : this.verProfesores()){
            if(p.getApellidos().contains(apellidos)){
                busquedaProfesores.add(p);
            }
        }
        return busquedaProfesores;
    }

    @Override
    public List<Alumno> buscarAlumnos(String apellidos) {
        Comparator<Alumno> apellidoCmp = (a1, a2) -> {
            return a1.getApellidos().compareTo(a2.getApellidos());
        };
        
        Comparator<Alumno> nombreCmp = (a1, a2) -> {
            return a1.getNombres().compareTo(a2.getNombres());
        };
        
        List<Alumno> busquedaAlumnos = new ArrayList<>();
        for(Alumno a : this.verAlumnos()){
            if(a.getApellidos().contains(apellidos)){
                busquedaAlumnos.add(a);
            }
        }
        return busquedaAlumnos;
    }

    @Override
    public boolean hayAutoresConEsteGrupo(Grupo grupo) {
        for(Autor a  : AUTORES){
            if(a.mostrarGrupos().contains(grupo)){
                return true;
            }
        }
        return false;
    }
    
  
    
}