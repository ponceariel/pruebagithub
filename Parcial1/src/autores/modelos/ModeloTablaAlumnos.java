/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author usuario
 */
public class ModeloTablaAlumnos extends AbstractTableModel{
    
    private ArrayList<String>nombreColumnas=new ArrayList<>();
    private ArrayList<Alumno>nombreFilas=new ArrayList<>();
    
    public ModeloTablaAlumnos() {
        nombreColumnas.add("DNI");
        nombreColumnas.add("Apellidos");
        nombreColumnas.add("Nombres");
        nombreColumnas.add("Cx");
        
        GestorAutores ge= GestorAutores.crear();
        this.nombreFilas=ge.verAlumnos();

        for(Alumno a: this.nombreFilas){
            a.toString();
        }
//        for(Alumno a: this.nombreFilas){
//            a.toString();
//        }
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
         this.nombreFilas =ge.verAlumnos();
         this.fireTableDataChanged();
        
    }
    public Alumno verAlumnosSeleccionar(int selectedRow) {
        return this.nombreFilas.get(selectedRow);
    }
    public void setNombreFilas(ArrayList<Alumno> nombreFilas) {
        this.nombreFilas = nombreFilas;
    }
    
}
