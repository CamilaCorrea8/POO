
import java.util.*;

public class ListaPersonas {
    
    public static ArrayList<persona> personas;


    public ListaPersonas(){
        personas = new ArrayList();
        
    }
    
    public void añadirPersona(persona p) {
        personas.add(p);
    }
    
    public void eliminarPersona(int i) {
        personas.remove(i);

    }
    
    public void borrarLista() {
        personas.removeAll(personas);
    }

}
