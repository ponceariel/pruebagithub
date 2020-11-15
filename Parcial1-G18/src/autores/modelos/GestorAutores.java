
package autores.modelos;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import interfases.IGestorAutores;
import java.util.ArrayList;
 

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
        if((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cargo!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())){
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
      if(((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cx!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank()))){
           Autor alumno=new Alumno(dni,apellidos,nombres,cx,clave);
          if (!this.AUTORES.contains(alumno)){
          this.AUTORES.add(alumno);
          return Autor_Correcto;  
       }
        else
              return Autor_Repetido;
               }
       else 
              return  Autor_Incorrecto;
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
    public ArrayList<Autor> verAutores() {
        return AUTORES;
    }

    @Override
    public ArrayList<Profesor> verProfesores() { ///////////// REVISAR ESTE METODO POR SI SE LO NECESITA
        return null;
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {     ///////////////// REVISAR ESTE METODO POR SI SE LO NECESITA 
       return null;
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

  
  
    
}
