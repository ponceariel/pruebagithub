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
public class ModeloTablaProfesores extends AbstractTableModel{
    private ArrayList<String>nombreColumnas=new ArrayList<>();
    private ArrayList<Profesor>nombreFilas=new ArrayList<>();
    
    public ModeloTablaProfesores() {
        nombreColumnas.add("DNI");
        nombreColumnas.add("Apellidos");
        nombreColumnas.add("Nombres");
        nombreColumnas.add("Cargo");
        
         GestorAutores gp= GestorAutores.crear();
        this.nombreFilas=gp.verProfesores();

        for(Profesor a: this.nombreFilas){
            a.toString();
        }
    }

    @Override
    public int getRowCount() {
       return this.nombreFilas.size();
    }
    @Override
    public int getColumnCount() {
     return this.nombreColumnas.size();
    }
    @Override
    public Object getValueAt(int fila, int columna) {
    Profesor profe= this.nombreFilas.get(fila);
    switch(columna){
        case 0: return profe.getDNI();
        case 1: return profe.getApellidos();
        case 2: return profe.getNombres();
        default: return profe.getCargo();
        
    }
    
    }
    
    @Override
    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
        }
    
    public void actualizar(){
      GestorAutores gp= GestorAutores.crear();
      this.nombreFilas=gp.verProfesores();
      this.fireTableDataChanged();
    }
    public Profesor verProfesor(int selectedRow) {
      return this.nombreFilas.get(selectedRow);
    }
     public void setNombreFilas(ArrayList<Profesor> nombreFilas) {
        this.nombreFilas = nombreFilas;
    }         
 }
   

