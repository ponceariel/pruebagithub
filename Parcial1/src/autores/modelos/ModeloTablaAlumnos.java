/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ModeloTablaAlumnos {
    
    private ArrayList<String>nombreColumnas=new ArrayList<>();
    private ArrayList<Alumno>nombreFilas=new ArrayList<>();
    

    public ModeloTablaAlumnos() {
        nombreColumnas.add("DNI");
        nombreColumnas.add("Apellidos");
        nombreColumnas.add("Nombres");
        nombreColumnas.add("Cx");
        
        GestorAutores ge= GestorAutores.crear();
        this.nombreFilas=ge.verAlumnos();
        
    }


    public int getRowCount() {
       return this.nombreFilas.size();
    }

    public int getColumnCount() {
     return this.nombreColumnas.size();
    }

    public Object getValueAt(int fila, int columna) {
    Alumno alumno= this.nombreFilas.get(fila);
    switch(columna){
        case 0: return alumno.getDNI();
        case 1: return alumno.getApellidos();
        case 2: return alumno.getNombres();
        default: return alumno.getCx();
        
    }
    
    }

    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
        }
    
    public void actualizar(){
        GestorAutores ge= GestorAutores.crear();
        this.nombreFilas=ge.verAlumnos();
        this.fireTableDataChanged();
        
    }
}
