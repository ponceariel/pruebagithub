/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface IGestorAutores {
    public String nuevoAutor(int dni, String Apellidos,String nombres, Cargo cargo,String clave, String claveRepetida);
    
    public String nuevoAutor(int dni,String Apellidos,String nombres,String cx,String clave,String claveRepetida);
    
    public String modificarAutor(Autor autor,String apellidos,String nombres,Cargo cargo,String clave,String claveRepetida);
    
    public String modificarAutor(Autor autor,String apellidos,String nombres,String cx,String clave,String claveRepetida);
    
    public boolean existeEsteAutor(Autor autor);
    public  ArrayList <Autor> verAutores();
    public  ArrayList<Profesor>verProfesores();
    public ArrayList<Alumno>verAlumnos();
    public Autor verAutor(int dni);

    
    
}
