/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import lugares.modelos.Lugar;

/**
 *
 * @author usuario
 */
public interface IGestorLugares {
    public String nuevoLugar(String nombre);
    public ArrayList<Lugar>verLugares();
    public Lugar verLugar(String nombre);
}
