
package lugares.modelos;

import interfases.IGestorLugares;
import java.util.ArrayList;
import palabrasclaves.modelos.GestorPalabrasClaves;


public class GestorLugares implements IGestorLugares{

    private ArrayList<Lugar> LUGARES= new ArrayList<>();
    public static final String LUGAR_CORRECTO="Se pudo crear el lugar";
    public static final String LUGAR_INCORRECTO="No se pdo crear el lugar";
    public static final String LUGAR_REPETIDO="No se pudo crear el lugar porque ya existe";
    private static GestorLugares lauxiliar;

    private GestorLugares() {
    }
    
    public static GestorLugares crear(){
        if(lauxiliar == null)
            lauxiliar= new GestorLugares();
            return lauxiliar;
    }
    
    @Override
    public String nuevoLugar(String nombre) {
        
        if((nombre!=null) && (!nombre.isBlank())){
            Lugar LUGAR=new Lugar(nombre);
            
            if(!this.LUGARES.contains(LUGAR)){
                this.LUGARES.add(LUGAR);
                return LUGAR_CORRECTO;
            }
             else{
                 return LUGAR_REPETIDO;
            }   
        }else
             return LUGAR_INCORRECTO;  
    }

    @Override
    public Lugar verLugar(String nombre) {
    Lugar Lvalor=null;
    for(int i=0;i<LUGARES.size();i++){
        if(LUGARES.get(i).verNombre()==nombre)
        {
            Lvalor=LUGARES.get(i);
        }
    }
    return Lvalor;
    }
        

    @Override
    public ArrayList<Lugar> verLugares() {
        return LUGARES;
    }
    
    
}
