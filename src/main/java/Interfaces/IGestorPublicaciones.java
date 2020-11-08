/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;

/**
 *
 * @author usuario
 */
public interface IGestorPublicaciones {
    public String nuevaPublicacion(String titulo,MiembroEnGrupo miembroengrupo,LocalDate fechaPublicacion,Tipo tipo, Idioma idioma,Lugar lugar,ArrayList<PalabraClave> palabrasClaves,String enlace,String resumen);
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroengrupo,LocalDate fechaPublicacion,Tipo tipo,Idioma idioma,Lugar lugar,ArrayList<PalabraClave>palabrasClaves,String enlace, String resumen);
    public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabrasclaves);
    public boolean hayPublicacionesConEsteLugar(Lugar lugar);
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma);
    public boolean hayPublicacionesConEsteTipo(Tipo tipo);
    public boolean hayPublicacionesConEsteAutor(Autor autor);
    public boolean existeEstaPublicacion(Publicacion publicacion);
    public ArrayList<Publicacion>verPublicaciones();
    public Publicacion verPublicacion(String titulo);
}
