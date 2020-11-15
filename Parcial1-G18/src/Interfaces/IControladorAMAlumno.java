/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;

/**
 *
 * @author usuario
 */
public interface IControladorAMAlumno {
 public static final String TITULO_NUEVO = "Nuevo alumno"; 
 public static final String TITULO_MODIFICAR = "Modificar alumno";  public static final String CONFIRMACION = "¿Desea borrar los grupos especificados?"; 
 /** 
 * Acción a ejecutar cuando se selecciona el botón Guardar 
 * @param evt evento 
 */ 
 public void btnGuardarClic(ActionEvent evt); 
 /** 
 * Acción a ejecutar cuando se selecciona el botón Cancelar 
 * @param evt evento 
 */ 
 public void btnCancelarClic(ActionEvent evt); 
  
// * Acción a ejecutar cuando se presiona una tecla en el campo txtApellidos Evaluativo 2 - 
    
}