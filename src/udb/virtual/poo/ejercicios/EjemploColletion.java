package udb.virtual.poo.ejercicios;


import java.util.ArrayList;
import java.util.Collection;

public class EjemploColletion {
    
    public static void main(String[] args) {


        Collection textosRandomPrueba = new ArrayList(); //¿Cómo se declaran?
        
        //
        textosRandomPrueba.add("A"); //¿Cómo se pueden asignar valores?
        textosRandomPrueba.add("E"); 
        textosRandomPrueba.add("I"); 
        textosRandomPrueba.add("O");
        textosRandomPrueba.add("U");
        
        textosRandomPrueba.add(1); 
        textosRandomPrueba.add(2); 
        textosRandomPrueba.add(3); 
        textosRandomPrueba.add(4);
        textosRandomPrueba.add(5);
        
        System.out.println(textosRandomPrueba.toString());
        System.out.println("Hasta aca se cuentan los elementos en Collection: " + textosRandomPrueba.size() ) ;
        
        ArrayList textosRandomPruebaArray = new ArrayList();
        
        textosRandomPruebaArray.add("A"); 
        textosRandomPruebaArray.add("E"); 
        textosRandomPruebaArray.add("I"); 
        textosRandomPruebaArray.add("O");
        textosRandomPruebaArray.add("U");
        
        textosRandomPruebaArray.add(1); 
        textosRandomPruebaArray.add(2); 
        textosRandomPruebaArray.add(3); 
        textosRandomPruebaArray.add(4);
        textosRandomPruebaArray.add(5);
        
        
                 for(int i = 0; i < textosRandomPruebaArray.size(); i++) { 
            System.out.println(textosRandomPruebaArray.get(i));
        }
        
        System.out.println("Hasta aca se cuentan los elementos en Array: " + textosRandomPruebaArray.size() ) ;
        
        
        textosRandomPruebaArray.remove("A");//¿Cómo se pueden eliminar valores?
        
        
                 for(int i = 0; i < textosRandomPruebaArray.size(); i++) { 
            System.out.println(textosRandomPruebaArray.get(i));
        }
        
        System.out.println("Hasta aca se cuentan los elementos en Array, se elimino uno: " + textosRandomPruebaArray.size() ) ;
        
        
        

        
    }
}
