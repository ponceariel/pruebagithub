/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.g18;

import Interfaces.IControladorAutores;
import Interfaces.IControladorPrincipal;
import autores.controladores.ControladorAMAutores;
import principal.controladores.ControladorPrincipal;
import principal.vistas.VentanaPrincipal;

/**
 *
 * @author usuario
 */
public class Parcial1G18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        IControladorPrincipal c=new ControladorPrincipal();
//        VentanaPrincipal ventana=new VentanaPrincipal(c);
//        ventana.setVisible(true);//se hace visible la ventana
//        ventana.setLocationRelativeTo(null); //se centra la ventana
         IControladorAutores ca=new ControladorAMAutores();
         
         
    }
    
}
