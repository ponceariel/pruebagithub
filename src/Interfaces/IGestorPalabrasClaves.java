/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;

/**
 *
 * @author usuario
 */
public interface IGestorPalabrasClaves {
    public String nuevaPalabraClave(String nombre);
    public ArrayList<PalabraClave>verPalabraClave();
    public PalabraClave verTipo(String nombre);
}
