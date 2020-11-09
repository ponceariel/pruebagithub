/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import grupos.modelos.GestorGrupos;
import grupos.modelos.Grupo;
import idiomas.modelos.GestorIdiomas;
import java.util.ArrayList;
import lugares.modelos.GestorLugares;
import palabrasclaves.modelos.GestorPalabrasClaves;
import tipos.modelos.GestorTipos;
import tipos.modelos.Tipo;

/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args) {
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//PRUEBA GESTORTIPOS///////////////////////////////////////////////////////////////////////////////////////
    System.out.println("/////////PRUEBA GESTORTIPOS////////");
       GestorTipos gt1 = GestorTipos.crear();
        System.out.println(gt1.nuevoTipo("FISICA"));
        System.out.println(gt1.nuevoTipo("FISICA"));
        System.out.println(gt1.nuevoTipo("FISICA2"));
        System.out.println(gt1.nuevoTipo(""));
        System.out.println(gt1.nuevoTipo("FISICA3"));
        System.out.println(gt1.nuevoTipo(null));
        //prueba para el metodo verTipos()
        System.out.println(gt1.verTipos());
        //prueba para el metodo verTipo(String nombre)
        System.out.println(gt1.verTipo("FISICA4"));
        System.out.println(gt1.verTipo("FISICA"));
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//PRUEBA GESTORPALABRACLAVE///////////////////////////////////////////////////////////////////////////////////////   
    System.out.println("////////PRUEBA GESTORPALABRASCLAVES//////");
        GestorPalabrasClaves gpc1 = GestorPalabrasClaves.crear();
        System.out.println(gpc1.nuevaPalabraClave("palabraclave1"));
        System.out.println(gpc1.nuevaPalabraClave("palabraclave1"));
        System.out.println(gpc1.nuevaPalabraClave("palabraclave2"));
        System.out.println(gpc1.nuevaPalabraClave(""));
        System.out.println(gpc1.nuevaPalabraClave("palabraclave3"));
        System.out.println(gpc1.nuevaPalabraClave(null));
        //prueba para el metodo verpalabrasclaves()
        System.out.println(gpc1.verPalabrasClaves());
        //prueba para el metodo verPalabraClave(String nombre)
        System.out.println(gpc1.verPalabraClave("palabraclave4"));
        System.out.println(gpc1.verPalabraClave("palabraclave2"));
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//PRUEBA GESTORLUGARES///////////////////////////////////////////////////////////////////////////////////////   
    System.out.println("////////PRUEBA GESTORLUGARES//////");
    GestorLugares gL1 = GestorLugares.crear();
        System.out.println(gL1.nuevoLugar("lugar1"));
        System.out.println(gL1.nuevoLugar("lugar1"));
        System.out.println(gL1.nuevoLugar("lugar2"));
        System.out.println(gL1.nuevoLugar(""));
        System.out.println(gL1.nuevoLugar("lugar3"));
        System.out.println(gL1.nuevoLugar(null));
        //prueba para el metodo verLugares()
        System.out.println(gL1.verLugares());
        //prueba para el metodo verLugar(String nombre)
        System.out.println(gL1.verLugar("lugar4"));
        System.out.println(gL1.verLugar("lugar2"));
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//PRUEBA GESTORLUGARES///////////////////////////////////////////////////////////////////////////////////////   
    System.out.println("////////PRUEBA GESTORIDIOMAS//////");
    GestorIdiomas gI1 = GestorIdiomas.crear();
        System.out.println(gI1.nuevoIdioma("idioma1"));
        System.out.println(gI1.nuevoIdioma("idioma1"));
        System.out.println(gI1.nuevoIdioma("idioma2"));
        System.out.println(gI1.nuevoIdioma(""));
        System.out.println(gI1.nuevoIdioma("idioma3"));
        System.out.println(gI1.nuevoIdioma(null));
        //prueba para el metodo verIdiomas()
        System.out.println(gI1.verIdiomas());
        //prueba para el metodo verIdioma(String nombre)
        System.out.println(gI1.verIdioma("idioma4"));
        System.out.println(gI1.verIdioma("idioma2"));
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//PRUEBA GESTORGRUPOS///////////////////////////////////////////////////////////////////////////////////////   
    System.out.println("////////PRUEBA GESTORGRUPOS//////");
    GestorGrupos gg1 = GestorGrupos.crear();
        System.out.println(gg1.nuevoGrupo("grupo1","descripcion1"));
        System.out.println(gg1.nuevoGrupo("grupo1","descripcion1"));
        System.out.println(gg1.nuevoGrupo("grupo2","descripcion2"));
        System.out.println(gg1.nuevoGrupo("",""));
        System.out.println(gg1.nuevoGrupo("grupo3","descripcion3"));
        System.out.println(gg1.nuevoGrupo(null,null));
        //prueba para el metodo verTipos()
        System.out.println(gg1.verGrupos());
        //Hago modificacion en descripciones
        Grupo grupo=new Grupo("grupo2","descripcion2");//creo dos objetos tipo Grupo
        Grupo grupoA=new Grupo("grupoA","descripcionA");
        System.out.println(gg1.modificarGrupo(grupo, "descripcion2plus"));
        //prueba de existencia de un grupo en el arraylist
        if(gg1.existeEsteGrupo(grupoA)==true){
            System.out.println("Este grupo existe");
        }
        else 
            System.out.println("Este grupo no existe");
        
        if(gg1.existeEsteGrupo(grupo)==true){
            System.out.println("Este grupo existe");
        }
        else 
            System.out.println("Este grupo no existe");
        
        //prueba para el metodo verTipo(String nombre)
        System.out.println(gg1.verGrupo("grupo4"));
        System.out.println(gg1.verGrupo("grupo2"));
        //Se verifica los cambios 
        System.out.println(gg1.verGrupos());
    }
}
