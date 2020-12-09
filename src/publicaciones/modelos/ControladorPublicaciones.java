/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import Interfaces.IGestorPublicaciones;
import autores.vistas.ModeloComboCargo;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import interfaces.IControladorAMPublicacion;
import interfaces.IControladorPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.vistas.VentanaNuevaPublicacion;
import tipos.modelos.Tipo;

/**
 *
 * @author willz
 */
public class ControladorPublicaciones implements IControladorAMPublicacion{
 
    VentanaNuevaPublicacion nueva;
    
     public ControladorPublicaciones() {
        this.nueva= new VentanaNuevaPublicacion(this,null,true);
        this.nueva.setLocationRelativeTo(null);
        JComboBox ComboIdiomas = new JComboBox();
        ComboIdiomas.setModel(new ModeloComboIdiomas());
        this.nueva.getComboBoxIdiomas().setModel(new ModeloComboIdiomas());
        JComboBox ComboLugares = new JComboBox();
        ComboLugares.setModel(new ModeloComboLugar());
        this.nueva.getComboBoxLugar().setModel(new ModeloComboLugar());
        JComboBox ComboTipos = new JComboBox();
        ComboTipos.setModel(new ModeloComboTipo());
        this.nueva.getComboBoxTipo().setModel(new ModeloComboTipo());
        JComboBox ComboGrupos = new JComboBox();
        ComboGrupos.setModel(new ModeloComboGrupo());
        this.nueva.getComboBoxGrupos().setModel(new ModeloComboGrupo());
        JTable tablapalabraclave=new JTable();
        tablapalabraclave.setModel(new ModeloTablaPalabrasClave());
        this.nueva.getTablaPalabrasClave().setModel(new ModeloTablaPalabrasClave());
        ModeloTablaPalabrasClave mtpc=(ModeloTablaPalabrasClave)this.nueva.getTablaPalabrasClave().getModel();
        mtpc.actualizar();
        this.nueva.setVisible(true);
          
        
    }
    @Override
    public void btnGuardarClic(ActionEvent evt) {
        String titulo=this.nueva.getTxtTitulo().getText();
        Lugar lugar=((ModeloComboLugar)this.nueva.getComboBoxLugar().getModel()).obtenerLugar();
        Tipo tipo=((ModeloComboTipo)this.nueva.getComboBoxTipo().getModel()).obtenerTipo();
        Idioma idioma=((ModeloComboIdiomas)this.nueva.getComboBoxIdiomas().getModel()).obtenerIdioma();
        Grupo grupo=((ModeloComboGrupo)this.nueva.getComboBoxGrupos().getModel()).obtenerGrupo();
        MiembroEnGrupo miembroengrupo= grupo.mostrarMiembroEnGrupos().get(0);
        Date date=this.nueva.getDateChooserFecha().getCalendar().getTime();
        LocalDate Fechapublicacion= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String Resumen=this.nueva.getTxtresumen().getText();
        ModeloTablaPalabrasClave mtpc=(ModeloTablaPalabrasClave)this.nueva.getTablaPalabrasClave().getModel();
        List< PalabraClave> pc= (List< PalabraClave>) mtpc.verPalabraClave(this.nueva.getTablaPalabrasClave().getSelectedRow());
        String enlace =this.nueva.getTxtEnlace().getText();
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        gp.nuevaPublicacion(titulo, miembroengrupo, Fechapublicacion, tipo, idioma, lugar, (List<PalabraClave>) pc, Resumen, Resumen);
        System.out.println(gp.verPublicaciones());
        this.nueva.dispose();
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        ControladorAMPublicaciones cp= new ControladorAMPublicaciones();
    }

    @Override
    public void txtTituloPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c))
         evt.consume();
    }

    @Override
    public void btnTodasLasPalabrasClavesClic(ActionEvent evt) {
    ModeloTablaPalabrasClave mtpc = (ModeloTablaPalabrasClave)nueva.getTablaPalabrasClave().getModel();
    ListSelectionModel modeloSeleccion = nueva.getTablaPalabrasClave().getSelectionModel();
    modeloSeleccion.addSelectionInterval(0, mtpc.getRowCount() - 1);
    }

    @Override
    public void btnNingunaPalabraClaveClic(ActionEvent evt) {
     ListSelectionModel modeloSeleccion = nueva.getTablaPalabrasClave().getSelectionModel();
     modeloSeleccion.clearSelection();
    }

    @Override
    public void btnAbrirClic(ActionEvent evt) {
         
        //Se ponen en español los nombres de los botones de la ventana de diálogo
        UIManager.put("FileChooser.openButtonText","Abrir");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText","Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");
        UIManager.put("FileChooser.lookInLabelText", "Buscar en:");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo:");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Archivos del tipo:");
        UIManager.put("FileChooser.upFolderToolTipText", "Subir un nivel");
        UIManager.put("FileChooser.homeFolderToolTipText", "Inicio");
        UIManager.put("FileChooser.newFolderToolTipText", "Carpeta nueva");
        UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalles");
        
        JFileChooser selector = new JFileChooser();
        selector.setCurrentDirectory(new File(System.getProperty("user.home")));
        //se establece la carpeta personal del usuario para empezar la búsqueda
        selector.setDialogTitle(IControladorPrincipal.TITULO);
        selector.setAcceptAllFileFilterUsed(false); //no se muestra el filtro de todos los archivos
        
        int resultado = selector.showOpenDialog(null);
        
        if (resultado == JFileChooser.APPROVE_OPTION) { //se selecciona un archivo
            File selectedFile = selector.getSelectedFile();
            this.nueva.getTxtEnlace().setText(selectedFile.getAbsolutePath());
        }        
        
    }
   
    
    }
    

