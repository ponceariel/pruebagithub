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
public interface IControladorAIdioma {
    public static final String TITULO = "Nuevo Idioma";
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
/*
* Acción a ejecutar cuando se presiona una tecla en el campo txtNombre
}
