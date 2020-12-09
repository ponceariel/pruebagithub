/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.GestorAutores;
import autores.modelos.Rol;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author willz
 */
public class ModeloTablaModificarGrupo extends AbstractTableModel{

    private List<String>nombreColumnas=new ArrayList<>();
    private List<Autor>nombreFilas=new ArrayList<>();
    private List<MiembroEnGrupo> grupos=new ArrayList<>();
     private GestorAutores ga = GestorAutores.crear();
    private GestorGrupos gg= GestorGrupos.crear();
     private Grupo grupo;
    public ModeloTablaModificarGrupo(Grupo grupo) {
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Rol");
        this.nombreFilas=ga.verAutores();
         for(Autor a : nombreFilas){
            grupos.add(new MiembroEnGrupo(ga.verAutor(a.getDNI()), grupo, a.verRol(a, grupo)));
        }
        this.grupo=grupo;
        
    }
    @Override
    public int getRowCount() {
         return this.grupos.size();
    }

    @Override
    public int getColumnCount() {
            return this.nombreColumnas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MiembroEnGrupo grupo= this.grupos.get(rowIndex);
    switch(columnIndex){
        case 0:   return grupo.getAutor().getNombres();
        default : return grupo.getRol();
//                   for(MiembroEnGrupo meg : grupos){
//                    if(grupo.equals(meg.getAutor())){
//                        return meg.getRol();
//                    }
//                }
//                return grupo.verRol(grupo, this.grupo);
        }
        
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
          MiembroEnGrupo grupo1= this.grupos.get(rowIndex);
//          Autor a = this.nombreFilas.get(rowIndex);
//           MiembroEnGrupo megAux = null;
//        for(MiembroEnGrupo meg : grupos){
//            if(a.equals(meg.getAutor())){
//                megAux = meg;
//            }
//        }
          switch(columnIndex){
              case 0:  grupo1.getAutor().getNombres();
                         break;
              default: grupo1.setRol((Rol)aValue);
//                     
//                      if(grupos.contains(grupo1)){
//                          grupos.
//                      }
//                     
          }this.actualizar();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex==1){
            return true; //To change body of generated methods, choose Tools | Templates.
        }
        return false;
    }
    
    @Override
    public String getColumnName(int columna) {
         return this.nombreColumnas.get(columna);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
          switch(columnIndex){
            case 0: return String.class;
            default: return Rol.class;
        }
    }
    
    public void setNombreFilas(ArrayList<MiembroEnGrupo> grupos) {
        this.grupos = grupos;
    }
    public void ocultardatos(JTable tabla){
        
        for(int g=0;g<grupos.size();g++){
            tabla.getColumn(tabla.getColumnName(g)).setWidth(0);
        }
    }

    public MiembroEnGrupo verGrupoSeleccionar(int selectedRow) {
        return this.grupos.get(selectedRow);
    }
    
     public void actualizar(){
//         MiembroEnGrupo grupo= MiembroEnGrupo.crear();
//         this.grupos =(List<MiembroEnGrupo>) grupo.getGrupos();
         this.fireTableDataChanged(); 
    }
     public void agregarMiembro(){
        if(grupo==null){
            System.out.println("nulo-----------------------");
        }
        gg.agregarMiembros(grupo, grupos);
    }
}
