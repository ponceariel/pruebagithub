/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.g18;



import Interfaces.IGestorIdiomas;
import Interfaces.IGestorPalabrasClaves;
import idiomas.modelos.GestorIdiomas;
import interfaces.IControladorPrincipal;
import palabrasclaves.modelos.GestorPalabrasClaves;
import principal.controladores.ControladorPrincipal;
import publicaciones.modelos.ModeloTablaPalabrasClave;

/**
 *
 * @author Ariel Ponce
 */
public class Parcial2G18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IGestorIdiomas gi= GestorIdiomas.crear();
       gi.nuevoIdioma("ESPAÑOL");
       gi.nuevoIdioma("INGLES");
       gi.nuevoIdioma("ALEMAN");
       gi.nuevoIdioma("CHINO");
       gi.nuevoIdioma("PORTUGUES");
       System.out.println(gi.verIdiomas());
       IControladorPrincipal control=new ControladorPrincipal();
       
      }
    }
