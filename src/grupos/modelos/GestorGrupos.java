
package grupos.modelos;


import autores.modelos.Autor;
import interfaces.IGestorGrupos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import autores.modelos.GestorAutores;

public class GestorGrupos implements IGestorGrupos {

    private ArrayList<Grupo> GRUPOS= new ArrayList<>();
    GestorAutores ga1= GestorAutores.crear();
    final String DESCRIPCION_CAMBIO="Se ha producido un cambio en la descripcion de uno los grupos";
    private static GestorGrupos gauxiliar;
    public static final String MIEMBRO_EXITOSO="Se pudo agregar el nuevo miembro";
    public static final String MIEMBRO_ELIMINAR="Se pudo eliminar el miembro";
    public static final String GRUPO_CORRECTO="Se pudo crear el Grupo";
    public static final String GRUPO_NOMBRE_INCORRECTO="No se pdo crear el Grupo";
    public static final String GRUPO_REPETIDO="No se pudo crear el Grupo porque ya existe";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el grupo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el grupo seleccionado";
    public static final String EXISTE_GRUPO= "ERROR. Existe una publicación asociada a ese grupo";
    public static final String EXISTE_PUBlICACION = "No se pudo crear debido a que existe una publicación asociada a ese grupo";
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
       Collections.sort(GRUPOS);
        return GRUPOS;
    }
     public List<Autor> verMiembros (Grupo grupo){
        List<Autor> autoresMiembros = new ArrayList<>();
        for(MiembroEnGrupo meg : grupo.mostrarMiembroEnGrupos()){
            if(grupo.equals(meg.getGrupos())){
                autoresMiembros.add(meg.getAutor());
            }
        }
        return autoresMiembros;
    }
    @Override
    public String borrarGrupo(Grupo grupo) {
       
       
        if (GRUPOS.contains(grupo)){
            if(ga1.hayAutoresConEsteGrupo(grupo)){
                return EXISTE_PUBlICACION;
            }
            GRUPOS.remove(grupo);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public String agregarMiembros(Grupo grupo, List<MiembroEnGrupo> miembros) {
           for (MiembroEnGrupo meg: miembros){
            if(meg.getRol()!= null){
                grupo.agregarMiembro(meg.getAutor(), meg.getRol());
            }
        }
        return MIEMBRO_EXITOSO;
    }

    @Override
    public String quitarMiembros(Grupo grupo, List<MiembroEnGrupo> miembros) {
        for (MiembroEnGrupo meg: miembros){
           if(grupo.equals(meg.getGrupos())){
               grupo.quitarMiembro(meg.getAutor());
           }
       }
       return MIEMBRO_ELIMINAR;
    }

    @Override
    public List<Grupo> buscarGrupos(String nombre) {
         List<Grupo> busquedaGrupos = new ArrayList<>();
        for (Grupo g : GRUPOS){
            if (g.verNombre().contains(nombre)){
                busquedaGrupos.add(g);
            }
        }
        Collections.sort(busquedaGrupos);
        return busquedaGrupos;
    }

    @Override
    public String actualizarGrupos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
