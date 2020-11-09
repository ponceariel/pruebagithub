
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
            
            if(!this.AUTOR.contains(profe)){
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
            
            if(!this.AUTOR.contains(alumno)){
                this.AUTOR.add(alumno);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeEsteAutor(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Autor> verAutores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Profesor> verProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Autor verAutor(int dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
