
package palabrasclaves.modelos;


import Interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;


public class GestorPalabrasClaves implements IGestorPalabrasClaves {

     private ArrayList<PalabraClave> PCLAVES= new ArrayList<>();
    public static final String PCLAVE_CORRECTO="Se pudo crear la palabraclave";
    public static final String PCLAVE_INCORRECTO="No se pdo crear la palabraclave";
    public static final String PCLAVE_REPETIDA="No se pudo crear la palabraclave porque ya existe";
    private static GestorPalabrasClaves pcauxiliar;

    private GestorPalabrasClaves() {
    }
    
    
    public static GestorPalabrasClaves crear(){
        if(pcauxiliar == null)
            pcauxiliar= new GestorPalabrasClaves();
            return pcauxiliar;
    }
    
    @Override
    public String nuevaPalabraClave(String nombre) {
       
        if((nombre!=null) && (!nombre.isBlank())){
            PalabraClave Pclave=new PalabraClave(nombre);
            
            if(!this.PCLAVES.contains(Pclave)){
                this.PCLAVES.add(Pclave);
                return PCLAVE_CORRECTO;
            }
             else{
                 return PCLAVE_REPETIDA;
            }   
        }else
             return PCLAVE_INCORRECTO;  
    }       
   


    public PalabraClave verTipo (String nombre) {
        boolean b = false;
        PalabraClave pcvalor=null;
        for(int i=0;i<PCLAVES.size();i++){
              if(PCLAVES.get(i).verNombre()==nombre){
                  pcvalor=PCLAVES.get(i);
                  b=true;
              }
        }
        return pcvalor;
    }

    public ArrayList<PalabraClave> verPalabraClave() {
       return PCLAVES;
    }

    

   
}
