
package tipos.modelos;

import Interfaces.IGestorTipos;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class GestorTipos implements IGestorTipos {
    private  ArrayList<Tipo> tipos =new ArrayList<>();
    public static final String TIPO_EXITO="Se pudo crear el Tipo";
    public static final String TIPO_NOMBRE_INCORRECTO="No se pdo crear el Tipo";
    public static final String TIPO_REPETIDO="No se pudo crear el Tipo porque ya existe";
    private static GestorTipos instancia; // aqui estoy creando una variable de clase para que no se puedan crear dos gestores
    private GestorTipos(){
        //aqui estoy definiendo un constructor predeterminado de gestortipo
    }
    public static GestorTipos crear(){
        if(instancia == null)
            instancia = new GestorTipos();
        return instancia;
    }
    //Con este metodo, puedo asegurarme de que no podre crear dos gestores tipos
    //en el main directamente hare:  GestorTipos gt1=GestorTipos.crear();
    //Si haria otro de estos, no podria.
    
     public String nuevoTipo(String nombre){
       if((nombre!=null && (!nombre.isBlank()))){
           Tipo t =new Tipo(nombre);
          if (!this.tipos.contains(t)){
          this.tipos.add(t);
          return TIPO_EXITO;  
       }
        else
              return TIPO_REPETIDO;
               }
       else 
              return  TIPO_NOMBRE_INCORRECTO;
     }
//aqui defino el metodo verTipo(String nombre)     
    public Tipo verTipo(String nombre){
     int i;
     boolean b=false;
     Tipo valor = null;
    
     for(i=0;i<tipos.size();i++)
     {
       
       if(tipos.get(i).verNombre()== nombre) {
               b=true;
               valor=tipos.get(i);
     }  }
       System.out.println(" "+b);
     return valor;
    }
     //aqui defino el metodo verTipos()
    @Override
    public ArrayList<Tipo> verTipos() {
      return tipos;
    }
}