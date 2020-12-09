
package grupos.Controladores;

import autores.modelos.Autor;
import autores.modelos.GestorAutores;
import grupos.modelos.GestorGrupos;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.ModeloComboRol;
import grupos.modelos.ModeloTablaModificarGrupo;
import grupos.modelos.ModeloTablaModificarMiembrosGrupo;
import grupos.vistas.VentanaModificarGrupos;
import interfaces.IControladorModificarMiembros;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;


public class ControladorModificarGrupo implements IControladorModificarMiembros{

    VentanaModificarGrupos ventana;
    private Grupo grupoaux;
    private List<MiembroEnGrupo> miembros=new ArrayList<>();
     private List<Autor>aux=new ArrayList<>();
     private GestorAutores ga = GestorAutores.crear();
    private GestorGrupos gg = GestorGrupos.crear();
    
    public ControladorModificarGrupo() {
        
        this.ventana = new VentanaModificarGrupos(this,null,true);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    public ControladorModificarGrupo(Grupo grupo, JDialog padre,boolean modal) {
        this.ventana = new VentanaModificarGrupos(this, padre, modal);
        this.grupoaux=grupo;
        this.ventana.getjTable1().setModel(new ModeloTablaModificarGrupo(grupo));
        this.ventana.getjTable1().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JComboBox ComboRol= new JComboBox();
        ComboRol.setModel(new ModeloComboRol());
        TableColumn colRol=this.ventana.getjTable1().getColumnModel().getColumn(1);
        colRol.setCellEditor(new DefaultCellEditor(ComboRol));
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
//        this.ventana.setBox(this.ventana.getjTable1(), this.ventana.getjTable1().getColumn(1));
//        this.actualizar();
    }

    @Override
    public void btnTodosClic(ActionEvent evt) {
        ModeloTablaModificarGrupo mtmg = (ModeloTablaModificarGrupo)this.ventana.getjTable1().getModel();
        ListSelectionModel modeloSeleccion = this.ventana.getjTable1().getSelectionModel();
        modeloSeleccion.addSelectionInterval(0, mtmg.getRowCount()-1);
    }

    @Override
    public void btnNingunoClic(ActionEvent evt) {
        ModeloTablaModificarGrupo mtmg = (ModeloTablaModificarGrupo)this.ventana.getjTable1().getModel();
        ListSelectionModel modeloSeleccion = this.ventana.getjTable1().getSelectionModel();
        modeloSeleccion.clearSelection();
    }

    @Override
    public void btnAceptarClic(ActionEvent evt) {
         ModeloTablaModificarGrupo mtmg = (ModeloTablaModificarGrupo)this.ventana.getjTable1().getModel();
         mtmg.agregarMiembro();
         this.ventana.setVisible(false);
         this.ventana.dispose();
    }
    
    @Override
    public void btnCancelarClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }
    
    
}
