/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import tipos.modelos.Tipo;

/**
 *
 * @author usuario
 */
public interface IGestorTipos {
    public String nuevoTipo(String nombre);
    public ArrayList<Tipo>verTipos();
    public Tipo verTipo(String nombre);
}
