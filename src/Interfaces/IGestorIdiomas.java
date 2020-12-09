
package Interfaces;

import idiomas.modelos.Idioma;
import java.util.List;

public interface IGestorIdiomas {
    public Idioma verIdioma (String nombre);
    public String nuevoIdioma(String nombre);
    public String borrarIdioma(Idioma idioma);
    public List<Idioma> buscarIdiomas(String nombre);
    public List<Idioma> verIdiomas();
    public boolean existeEsteIdioma(Idioma idioma);
}
