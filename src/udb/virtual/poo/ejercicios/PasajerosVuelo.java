package udb.virtual.poo.ejercicios;

//Map
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PasajerosVuelo {
    
     public static void main(String[] args) {
        //¿Cómo se declaran?
        HashMap<String, String> hmap = new HashMap<String, String>();
            
        //¿Cómo se pueden asignar valores? Clave, valor
        hmap.put("A0242477", "Rosalía Cardona");
        hmap.put("B0940443", "Adán Abarca");
        hmap.put("S7542125", "Concepción Bonilla");
        hmap.put("D1041094", "Simón Fernández");            
        hmap.put("Z4612461", "Angelo Polanco");
            
        //Mostrando contenido usando Iterator
        System.out.println("Pasajeros del vuelo:");
        System.out.println("\nPasaporte Nombre");
        Set set = hmap.entrySet();
            Iterator iterador = set.iterator();
            while(iterador.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterador.next();
                System.out.println(mentry.getKey() + "  "
                + mentry.getValue());
            }
                       
        //¿Cómo se pueden eliminar valores? Remover elementos en base a clave
        hmap.remove("Z4612461");
        
        //Mostrando contenido después de eliminar elemento
        System.out.println("\n\nPasajeros después de eliminar al pasajero con pasaporte Z4612461:");
        System.out.println("\nPasaporte Nombre");
        for(Map.Entry m : hmap.entrySet()){    
        System.out.println(m.getKey()+"  "+m.getValue());
        }
     }
}
