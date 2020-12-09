/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import Interfaces.IGestorPublicaciones;
import autores.modelos.Alumno;
import autores.modelos.GestorAutores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ariel Ponce
 */
public class ModeloTablaPublicaciones extends AbstractTableModel {

    
    private ArrayList<String>nombreColumnas=new ArrayList<>();
    private List<Publicacion>nombreFilas=new ArrayList<>();
    
    public ModeloTablaPublicaciones() {
        nombreColumnas.add("Titulo");
        nombreColumnas.add("Autor");
        nombreColumnas.add("Año");
        
        
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        this.nombreFilas=gp.verPublicaciones();

        for(Publicacion p: this.nombreFilas){
            p.toString();
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
    Publicacion publicacion= this.nombreFilas.get(fila);
    switch(columna){
        case 0: return publicacion.getTitulo();
        case 1: return publicacion.getMiembroengrupo().getAutor();
        default: return publicacion.getFechaPublicacion().getYear();
    }
    
    }
    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
        }
    
    public void actualizar(){
        IGestorPublicaciones gp=GestorPublicaciones.crear();
         this.nombreFilas =gp.verPublicaciones();
         this.fireTableDataChanged();
        
    }
    public Publicacion verPublicacionesSeleccionar(int selectedRow) {
        return this.nombreFilas.get(selectedRow);
    }
    public void setNombreFilas(ArrayList<Publicacion> nombreFilas) {
        this.nombreFilas = nombreFilas;
    }
    
    
}
