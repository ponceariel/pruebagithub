/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import idiomas.modelos.Idioma;
import java.util.ArrayList;
import tipos.modelos.Tipo;

/**
 *
 * @author usuario
 */
public interface IGestorIdiomas {
    public String nuevoIdioma(String nombre);
    public ArrayList<Tipo>verIdiomas();
    public Idioma verIdioma(String nombre);
}
