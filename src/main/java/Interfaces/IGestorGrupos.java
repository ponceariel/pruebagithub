/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import grupos.modelos.Grupo;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface IGestorGrupos {
    public String nuevoGrupo(String nombre,String Descripcion);
    public String modificarGrupo(Grupo grupo,String descripcion);
    public ArrayList <Grupo>verGrupos();
    public Grupo verGrupo(String nombre);
    public boolean existeEsteGrupo(Grupo grupo);
    
}
