/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import Interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import palabrasclaves.modelos.GestorPalabrasClaves;
import palabrasclaves.modelos.PalabraClave;

/**
 *
 * @author Ariel Ponce
 */
public class ModeloTablaPalabrasClave extends AbstractTableModel {

    private ArrayList<String>nombreColumnas=new ArrayList<>();
    private ArrayList<PalabraClave>nombreFilas=new ArrayList<>();
    
    public ModeloTablaPalabrasClave() {
       nombreColumnas.add("Nombre");
       IGestorPalabrasClaves gpc= GestorPalabrasClaves.crear();
       gpc.nuevaPalabraClave("HARDWARE");
       gpc.nuevaPalabraClave("SALUD");
       gpc.nuevaPalabraClave("ECONOMIA");
       gpc.nuevaPalabraClave("SOFTWARE");
       gpc.nuevaPalabraClave("ENERGIA RENOVABLE");
      
       
        this.nombreFilas=gpc.verPalabraClave();

        for(PalabraClave pc: this.nombreFilas){
            pc.toString();
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
    PalabraClave pc= this.nombreFilas.get(fila);
    switch(columna){
        default: return pc.verNombre();
        
    }
    
    }
    
    @Override
    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
        }
    
//    public void actualizar(){
//      GestorAutores gp= GestorAutores.crear();
//      this.nombreFilas=gp.verProfesores();
//      this.fireTableDataChanged();
//    }
    public PalabraClave verPalabraClave(int selectedRow) {
      return this.nombreFilas.get(selectedRow);
    }
     public void setNombreFilas(ArrayList<PalabraClave> nombreFilas) {
        this.nombreFilas = nombreFilas;
    }     
      public void actualizar(){
      IGestorPalabrasClaves gpc= GestorPalabrasClaves.crear();
      this.nombreFilas=gpc.verPalabraClave();
      this.fireTableDataChanged();
 }
   
} 

