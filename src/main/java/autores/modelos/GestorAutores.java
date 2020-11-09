
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
    public static final String Descripcion_Cambio="se cambio la descipcion";
    
    private ArrayList<Autor> AUTOR= new ArrayList<>();
    private ArrayList<Profesor> PROFESORES= new ArrayList<>();
    private ArrayList<Alumno> ALUMNOS= new ArrayList<>();
    private static GestorAutores auxiliar;
    
    public static GestorAutores crear(){
        if(auxiliar == null)
            auxiliar= new GestorAutores();
            return auxiliar;
        }
    
    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cargo!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())){
            Autor profe=new Profesor(dni,apellidos,nombres,clave,cargo);
            
            if(!this.PROFESORES.contains(profe) && !this.AUTOR.contains(profe)){
                this.PROFESORES.add((Profesor) profe);
                this.AUTOR.add(profe);
                return Autor_Correcto;
            }
             else{
                 return Autor_Repetido;
            }   
        }else
             return Autor_Incorrecto;
    }
    public String nuevoAutor(int dni, String apellidos, String nombres,int cx, String clave, String claveRepetida) {
       if((dni!=0)&&(apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cx!=0)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())){
            Autor alumno=new Alumno(dni,apellidos,nombres,clave,cx);
            
            if(!this.AUTOR.contains(alumno) && !this.ALUMNOS.contains(alumno)){
                this.AUTOR.add(alumno);
                this.ALUMNOS.add((Alumno) alumno);
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
       if((apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cargo!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())){
            for(int j=0;j<AUTOR.size(); j++)
       {
            if(this.AUTOR.contains(autor)){
                this.AUTOR.get(j).setApellidos(apellidos);
                this.AUTOR.get(j).setNombres(nombres);
                this.AUTOR.get(j).setClave(clave);
                this.AUTOR.get(j).setClave(claveRepetida);
                
            } 
       } 
            for(int i=0;i<PROFESORES.size(); i++)
          {
                if(this.PROFESORES.contains(autor)){
                this.PROFESORES.get(i).setApellidos(apellidos);
                this.PROFESORES.get(i).setNombres(nombres);
                this.PROFESORES.get(i).setClave(clave);
                this.PROFESORES.get(i).setClave(claveRepetida);
                
            } 
     }
      
   }  return Autor_Correcto; 
 }
    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
      if((apellidos!=null)&&(!apellidos.isBlank())&&(nombres!=null)&&(!nombres.isBlank())&&(cx!=null)&&(claveRepetida!=null)&&(!claveRepetida.isBlank())){
            for(int j=0;j<AUTOR.size(); j++)
       {
            if(this.AUTOR.contains(autor)){
                this.AUTOR.get(j).setApellidos(apellidos);
                this.AUTOR.get(j).setNombres(nombres);
                this.AUTOR.get(j).setClave(clave);
                this.AUTOR.get(j).setClave(claveRepetida);
                
            }
              for(int i=0;i<ALUMNOS.size(); i++)
          {
                if(this.ALUMNOS.contains(autor)){
                this.ALUMNOS.get(i).setApellidos(apellidos);
                this.ALUMNOS.get(i).setNombres(nombres);
                this.ALUMNOS.get(i).setClave(clave);
                this.ALUMNOS.get(i).setClave(claveRepetida);
                
            } 
       }
     }
       
    }return Autor_Correcto;  
  }
    @Override
    public boolean existeEsteAutor(Autor autor) {
        boolean b=false;
     for(int i=0;i<AUTOR.size();i++){
         if(AUTOR.get(i).equals(autor)){
             b=true;
         }
     }
     return b;
    }

    @Override
    public ArrayList<Autor> verAutores() {
       return AUTOR;
    }

    @Override
    public ArrayList<Profesor> verProfesores() {
       return PROFESORES;
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {
       return ALUMNOS;
    }

    @Override
    public Autor verAutor(int dni) {
        Autor Avalor=null;    
        for(int i=0;i<AUTOR.size();i++)
        {
            if(AUTOR.get(i).getDNI()==dni)
            {
                Avalor=AUTOR.get(i);
            }
        }
        return Avalor;
    }
}
