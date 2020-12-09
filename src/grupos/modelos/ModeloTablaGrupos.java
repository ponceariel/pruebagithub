/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaGrupos extends AbstractTableModel{
    
    private List<String>nombreColumnas=new ArrayList<>();
    private List<Grupo>nombreFilas=new ArrayList<>();
    GestorGrupos gg= GestorGrupos.crear();
    public ModeloTablaGrupos() {
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Descripcion");
        this.nombreFilas=gg.verGrupos();
        
         
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        Grupo grupo= this.nombreFilas.get(rowIndex);
    switch(columnIndex){
         case 0: return grupo.verNombre();
            default: return grupo.verDescripcion();
        }
    }
    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
    }
    public void setNombreFilas(List<Grupo> nombreFilas) {
        this.nombreFilas = nombreFilas;
    }
    public void ocultardatos(JTable tabla){
        
        for(int g=0;g<nombreFilas.size();g++){
            tabla.getColumn(tabla.getColumnName(g)).setWidth(0);
        }
    }

    public Grupo verGrupoSeleccionar(int selectedRow) {
        return this.nombreFilas.get(selectedRow);
    }
    
     public void actualizar(){
         GestorGrupos grupo= GestorGrupos.crear();
         this.nombreFilas =grupo.verGrupos();
         this.fireTableDataChanged();
        
    }
}
