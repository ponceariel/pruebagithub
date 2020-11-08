
package idiomas.modelos;

import interfases.IGestorIdiomas;
import java.util.ArrayList;


public class GestorIdiomas implements IGestorIdiomas{

    private ArrayList<Idioma> IDIOMAS= new ArrayList<>();
    public static final String IDIOMA_CORRECTO="Se pudo crear el Idioma";
    public static final String IDIOMA_NOMBRE_INCORRECTO="No se pdo crear el Idioma";
    public static final String IDIOMA_REPETIDO="No se pudo crear el Idioma porque ya existe";
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
         if(IDIOMAS.get(i).verNombre()==nombre)
         {
             ivalor=IDIOMAS.get(i);
         }
         
     }
     return ivalor;
    }

    @Override
    public ArrayList<Idioma> verIdiomas() {
        return IDIOMAS;
    }
    
     
}
