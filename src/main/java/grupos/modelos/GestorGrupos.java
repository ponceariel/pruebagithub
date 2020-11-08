
package grupos.modelos;

import interfases.IGestorGrupos;
import java.util.ArrayList;
import java.util.Objects;


public class GestorGrupos implements IGestorGrupos {

    private ArrayList<Grupo> GRUPOS= new ArrayList<>();
    public static final String GRUPO_CORRECTO="Se pudo crear el Grupo";
    public static final String GRUPO_NOMBRE_INCORRECTO="No se pdo crear el Grupo";
    public static final String GRUPO_REPETIDO="No se pudo crear el Grupo porque ya existe";
    public static final String DESCRIPCION_CAMBIO="Se ha producido un cambio en la descripcion de uno los grupos";
    private static GestorGrupos gauxiliar;
    
    public static GestorGrupos crear(){
        if(gauxiliar == null)
            gauxiliar= new GestorGrupos();
            return gauxiliar;
        }
    @Override
    public String nuevoGrupo(String nombre, String descripcion) {
        if((nombre!=null) && (!nombre.isBlank())){
            Grupo GRUPO=new Grupo(nombre,descripcion);
            
            if(!this.GRUPOS.contains(GRUPO)){
                this.GRUPOS.add(GRUPO);
                return GRUPO_CORRECTO;
            }
             else{
                 return GRUPO_NOMBRE_INCORRECTO;
            }   
        }else
             return GRUPO_REPETIDO;
    }

    @Override
    public String modificarGrupo(Grupo grupo, String descripcion) {
        grupo.asignarDescripcion(descripcion);
        return DESCRIPCION_CAMBIO;
    }

    @Override
    public Grupo verGrupo(String nombre) {
    Grupo gvalor=null;    
        for(int i=0;i<GRUPOS.size();i++)
        {
            if(GRUPOS.get(i).verNombre()==nombre)
            {
                gvalor=GRUPOS.get(i);
            }
        }
        return gvalor;
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
//        if(grupo!=null)
//            return true;
//        else
//            return false;
     boolean b=false;
     for(int i=0;i<GRUPOS.size();i++){
         if(GRUPOS.get(i).equals(grupo)){
             b=true;
         }
     }
     return b;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.GRUPOS);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GestorGrupos other = (GestorGrupos) obj;
        if (!Objects.equals(this.GRUPOS, other.GRUPOS)) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Grupo> verGrupos() {
       return GRUPOS;
    }
    
    
}
