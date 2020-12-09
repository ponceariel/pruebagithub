
package idiomas.modelos;


import Interfaces.IGestorIdiomas;
import java.util.ArrayList;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;


public class GestorIdiomas implements IGestorIdiomas{

    private List <Idioma> IDIOMAS= new ArrayList<>();
    public static final String IDIOMA_CORRECTO="Se pudo crear el Idioma";
    public static final String IDIOMA_NOMBRE_INCORRECTO="No se pdo crear el Idioma";
    public static final String IDIOMA_REPETIDO="No se pudo crear el Idioma porque ya existe";
    public static final String BORRADO_EXITO="Se borro con existo el idioma";
    public static final String BORRADO_INEXISTENTE="No se logro borrar el idioma ya que no existe";
    public static final String EXISTE_IDIOMA="El Idioma ya existe";
    private static GestorIdiomas Iauxiliar;

    private GestorIdiomas() {
    }
    
    public static GestorIdiomas crear(){
        if(Iauxiliar == null)
            Iauxiliar= new GestorIdiomas();
            return Iauxiliar;
       }
    
    @Override
    public String nuevoIdioma(String nombre) {
        if((nombre!=null) && (!nombre.isBlank())){
            Idioma IDIOMA=new Idioma(nombre);
            
            if(!this.IDIOMAS.contains(IDIOMA)){
                this.IDIOMAS.add(IDIOMA);
                return IDIOMA_CORRECTO;
            }
             else{
                 return IDIOMA_REPETIDO;
            }   
        }else
             return IDIOMA_NOMBRE_INCORRECTO;
    }

   

 

    @Override
    public Idioma verIdioma(String nombre) {
     Idioma ivalor=null;
     for(int i=0;i<IDIOMAS.size();i++){
         if(IDIOMAS.get(i).verNombre() == null ? nombre == null : IDIOMAS.get(i).verNombre().equals(nombre))
         {
             ivalor=IDIOMAS.get(i);
         }
         
     }
     return ivalor;
    }

    @Override
    public List<Idioma> verIdiomas() {
//        Collections.sort(IDIOMAS);
        
        return IDIOMAS; 
    }

    @Override
    public String borrarIdioma(Idioma idioma) {
        GestorPublicaciones gestor = GestorPublicaciones.crear();
        if (IDIOMAS.contains(idioma)){
            if(gestor.hayPublicacionesConEsteIdioma(idioma)){
                return EXISTE_IDIOMA;
            }
            IDIOMAS.remove(idioma);
            return BORRADO_EXITO;
        }else 
             return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Idioma> buscarIdiomas(String nombre) {
           List<Idioma> busqueda = new ArrayList<>();
        for (Idioma i : IDIOMAS){
            if (i.verNombre().contains(nombre)){
                busqueda.add(i);
            }
        }
//        Collections.sort(busqueda);
        return busqueda;        
    }

    @Override
    public boolean existeEsteIdioma(Idioma idioma) {
         if(IDIOMAS.contains(idioma)){
            return true;
        }else
            return false;
    }
    
     
}
