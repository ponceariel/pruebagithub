
package interfases;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import java.util.ArrayList;


public interface IGestorAutores {
        
   
    
public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo,
String clave, String claveRepetida);
public String nuevoAutor(int dni, String apellidos, String nombres, String cx,
String clave, String claveRepetida);
public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo
cargo, String clave, String claveRepetida);
public String modificarAutor(Autor autor, String apellidos, String nombres, String
cx, String clave, String claveRepetida);
public boolean existeEsteAutor(Autor autor);
public ArrayList<Autor> verAutores();
public ArrayList<Profesor> verProfesores();
public ArrayList<Alumno> verAlumnos();
public Autor verAutor(int dni);
}
