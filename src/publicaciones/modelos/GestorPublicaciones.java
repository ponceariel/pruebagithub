
package publicaciones.modelos;

import Interfaces.IGestorPublicaciones;
import static Interfaces.IGestorPublicaciones.EXITO;
import static Interfaces.IGestorPublicaciones.INEXISTENTE;
import static Interfaces.IGestorPublicaciones.INVALIDO;
import static Interfaces.IGestorPublicaciones.MODIFICADO;
import static Interfaces.IGestorPublicaciones.REPETIDO;
import autores.modelos.Autor;
import static grupos.modelos.GestorGrupos.BORRADO_EXITO;
import static grupos.modelos.GestorGrupos.BORRADO_INEXISTENTE;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;


public class GestorPublicaciones implements IGestorPublicaciones {

    private static GestorPublicaciones auxiliar;
    private List<Publicacion> publicaciones = new ArrayList<> ();
     
    public static GestorPublicaciones crear(){
        if(auxiliar == null)
            auxiliar= new GestorPublicaciones();
            return auxiliar;
        }
           @Override
           public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen){
            if((titulo != null) && (miembroEnGrupo != null) && (fechaPublicacion != null) && (tipo != null)&& (lugar != null)&& (palabrasClaves != null)&& (enlace != null)&& (resumen != null) && (!titulo.isBlank()) && (!fechaPublicacion.toString().isBlank()) && (!palabrasClaves.toString().isBlank())&& (!miembroEnGrupo.getGrupos().toString().isBlank())&& (!enlace.isBlank())&& (!resumen.isBlank())){

            
               Publicacion p = new Publicacion(titulo, miembroEnGrupo, fechaPublicacion, tipo, idioma, lugar, palabrasClaves, enlace, resumen);
               if(!this.publicaciones.contains(p)){
                   this.publicaciones.add(p);
                   return EXITO;
               }
               else{
                   return REPETIDO;
               }
            }
        
        return INVALIDO;
       }
    @Override
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,List<PalabraClave> palabrasClaves, String enlace, String resumen) {
        if(auxiliar.existeEstaPublicacion(publicacion)){
            for (Publicacion p : publicaciones) {
                if(p.equals(publicacion)){
                    p.setMiembroengrupo(miembroEnGrupo);
                    p.setFechaPublicacion(fechaPublicacion);
                    p.setTipos(tipo);
                    p.setIdiomas(idioma);
                    p.setLugares(lugar);
                    p.setVectorpalabraclave(palabrasClaves);
                    p.setEnlace(enlace);
                    p.setResumen(resumen);
                    return MODIFICADO;
                }
            }
        }
        return INEXISTENTE;
    }

    @Override
    public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave) {
        for(Publicacion palabra  : publicaciones){
             for(PalabraClave pclave: palabra.getVectorpalabraclave()){
                if(pclave == palabraClave ){
                        return true;
                }
        
              }
        }
         return false;
    }

    @Override
    public boolean hayPublicacionesConEsteLugar(Lugar lugar) {
        for(Publicacion publicacion  : publicaciones){
            if(publicacion.getLugares()== lugar){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma) {
        for(Publicacion public_idioma  : publicaciones){
            if(public_idioma.getIdiomas()== idioma){
                return true;
            }
        }
        return false;       
    }

    @Override
    public boolean hayPublicacionesConEsteTipo(Tipo tipo) {
       for(Publicacion public_tipo  : publicaciones){
            if(public_tipo.getTipos()== tipo){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteAutor(Autor autor) {
        for(Publicacion public_miembro  : publicaciones){
            if(public_miembro.getMiembroengrupo().getAutor()== autor){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existeEstaPublicacion(Publicacion publicacion) {
        for(Publicacion publ : publicaciones){
            if(publ.equals(publicacion)){
                return true;
            }
        }
        return false;
    }

    
    public Publicacion verPublicacion(String titulo) {
        for(Publicacion public_titulo : publicaciones){
            if(public_titulo.getTitulo()== titulo){
                return public_titulo;
            }
        }
        return null;
    }

    @Override
    public List<Publicacion> verPublicaciones() {
        Collections.sort(publicaciones);
        return publicaciones;
    }

    @Override
    public String borrarPublicacion(Publicacion publicacion) {
        if (publicaciones.contains(publicacion)){
            if(existeEstaPublicacion(publicacion)){
           //     return EXISTE_PUBLIACION;
            }
            publicaciones.remove(publicacion);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Publicacion> buscarPublicaciones(String titulo) {
         List<Publicacion> busquedaPublicaciones = new ArrayList<>();
        for (Publicacion p : publicaciones){
            if (p.getTitulo().contains(titulo)){
                busquedaPublicaciones.add(p);
            }
        }
        Collections.sort(busquedaPublicaciones);
        return busquedaPublicaciones;
    }
    
    }
    

