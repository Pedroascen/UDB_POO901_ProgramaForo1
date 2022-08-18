package udb_virtual_poo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UDB_VIRTUAL_POO {
        //variables estaticas
        static String carnet,nombre,buscar;
        static  HashMap<String, String> EstudiantesMap = new HashMap<>();
    public static void main(String[] args) {
        //variables de entrada
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
        //Menú de consola
        System.out.println("***************************************");
        System.out.print("      Bienvenido a UDB Virtual\n");
        System.out.print("1- Ingresar alumno.\n");
        System.out.print("2- Filtrar alumno.\n");
        System.out.print("3- Mostrar alumnos.\n");
        System.out.print("4- Eliminar alumno.\n");
        System.out.print("5- Salir.\n");
        System.out.print("Por favor, ingrese una opción del menú:\n");
        
        //entrada de dato
        opcion = entrada.nextInt();
        System.out.println("***************************************");
        
        //casos de entrada
        switch(opcion){
            case 1:
                //Proceso
                IngresarRegistro();
                //final proceso
                System.out.println("***************************************");
                System.out.print("¿Desea continuar?\n");
                System.out.print("Digite cualquier número para continuar u opción 5 para salir.\n");
                opcion = entrada.nextInt();
                if(opcion==5){
                    System.out.println("Gracias por usar el programa!!!");
                    System.exit(0);
                }
            break;
            case 2: 
                 //Proceso
                FiltrarRegistro();
                //final proceso
                System.out.println("***************************************");
                System.out.print("¿Desea continuar?\n");
                System.out.print("Digite cualquier número para continuar u opción 5 para salir.\n");
                opcion = entrada.nextInt();
                if(opcion==5){
                    System.out.println("Gracias por usar el programa!!!");
                    System.exit(0);
                }
            break;
            case 3: 
                 //Proceso
                ListarRegistro();
                //final proceso
                System.out.println("***************************************");
                System.out.print("¿Desea continuar?\n");
                System.out.print("Digite cualquier número para continuar u opción 5 para salir.\n");
                opcion = entrada.nextInt();
                if(opcion==5){
                    System.out.println("Gracias por usar el programa!!!");
                    System.exit(0);
                }
            break;
            case 4:
                 //Proceso
                EliminarRegistro();
                //final proceso
                System.out.println("***************************************");
                System.out.print("¿Desea continuar?\n");
                System.out.print("Digite cualquier número para continuar u opción 5 para salir.\n");
                opcion = entrada.nextInt();
                if(opcion==5){
                    System.out.println("Gracias por usar el programa!!!");
                    System.exit(0);
                }
            break;
            case 5:
                System.out.println("Gracias por usar el programa!!!");
                System.exit(0);
            break;
        default: System.err.println("Opción inválida.");
            break;
        }}while(opcion!=5);
    }
    
    //metodos
    public static void IngresarRegistro(){
        System.out.println("Seleccionó la opción de ingresar registro.");
        //variables de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el carnet del alumno:");
        carnet = entrada.next();
        System.out.println("Ingrese el nombre del alumno:");
        nombre = entrada.next();
        
         //Agregando estudiante al Hashmap
        EstudiantesMap.put(carnet,nombre);
        //Imprimiendo mensaje
         System.out.println("Alumno ingresado exitosamente\r");
         System.out.println("El valor del carnet es: "+carnet);
         System.out.println("El valor del nombre es: "+nombre);
    }
    
    public static void FiltrarRegistro(){
          System.out.println("Seleccionó la opción de filtrar registro.");
        Scanner entrada = new Scanner(System.in);
        //Variables de entrada
         System.out.println("Por favor ingrese el carnet del alumno para buscar:");
         buscar = entrada.nextLine();
         
         if(EstudiantesMap.containsKey(buscar))
         {
             System.out.printf("Se encontró al alumno " +EstudiantesMap.get(buscar)+ " con el carnet " +buscar+".\n");
         }
         else
         {
             System.out.println("Alumno no encontrado, no se puede mostrar.\n");
         }
    }
    
    public static void ListarRegistro(){
        System.out.println("Seleccionó la opción de listar registros");
        System.out.println("Listando alumnos registrados:");
        Set set = EstudiantesMap.entrySet();
        Iterator iterador = set.iterator();
        while (iterador.hasNext()) {
            Map.Entry metry = (Map.Entry)iterador.next();
            System.out.println("Carnet: "+metry.getKey()+" - Nombre: "+metry.getValue());
        }
    }
    
    public static void EliminarRegistro(){
        System.out.println("Seleccionó la opción 4");
    }
}
