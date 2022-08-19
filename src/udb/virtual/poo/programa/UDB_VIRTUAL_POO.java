package udb.virtual.poo.programa;

//Aplicacion para registrar alumnos con interfaz Map
import java.awt.TextField;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UDB_VIRTUAL_POO {
        //variables de tipo estaticas
        static String carnet,nombre,buscar;
        //Declaracion del HashMap
        static  HashMap<String, String> EstudiantesMap = new HashMap<>();
    public static void main(String[] args) {
        //Datos de entrada con Scanner
        Scanner entrada = new Scanner(System.in);
        String num; 
        int opcion;
        
        do{
        //Menú de consola
        System.out.println("***************************************");
        System.out.print("      Bienvenido a UDB Virtual\n");
        System.out.print("1- Ingresar alumno.\n");
        System.out.print("2- Buscar alumno.\n");
        System.out.print("3- Mostrar alumnos.\n");
        System.out.print("4- Eliminar alumno.\n");
        System.out.print("5- Salir.\n");
        System.out.print("Por favor, ingrese una opción del menú:\n");
        
        //entrada de dato
        num = entrada.next();
        //validacion para solo números
        while(!num.matches("\\d{1}")){
            System.out.println("Ingrese una opción válida.");
            num = entrada.next();
        }
        opcion = Integer.parseInt(num);
        System.out.println("***************************************");
        
        //casos de entrada
        switch(opcion){
            case 1:
                //Metodo
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
                 //Metodo
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
                 //Metodo
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
                 //Metodo
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
    
    //metodo para validar opcion
    public boolean Validar(){
            return false;
    }
    
    //metodo para ingresar registro
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
    //metodo para buscar registro
    public static void FiltrarRegistro(){
        System.out.println("Seleccionó la opción de filtrar registro.");
        Scanner entrada = new Scanner(System.in);

         System.out.println("Por favor ingrese el carnet del alumno para buscar:");
         buscar = entrada.nextLine();
         //condicional de salida
         if(EstudiantesMap.containsKey(buscar))
         {
            System.out.printf("Se encontró al alumno " +EstudiantesMap.get(buscar)+ " con el carnet " +buscar+".\n");
         }
         else
         {
            System.out.println("Alumno no encontrado, no se puede mostrar.\n");
         }
    }
    //metodo para listar registros
    public static void ListarRegistro(){
        System.out.println("Seleccionó la opción de listar registros");
        System.out.println("Listando alumnos registrados:");
        //metodo set, para encapsular valores
        Set set = EstudiantesMap.entrySet();
        //iterador para recorrer objeto set
        Iterator iterador = set.iterator();
        if(iterador.hasNext()==false){
            System.out.println("No se encontraron registros...");
        }
        while (iterador.hasNext()) {
            Map.Entry metry = (Map.Entry)iterador.next();
            System.out.println("Carnet: "+metry.getKey()+" - Nombre: "+metry.getValue());
        }
    }
    //metodo para eliminar registro
    public static void EliminarRegistro(){
        System.out.println("Seleccionó la opción de eliminar registro");
        System.out.println("Por favor, ingrese el carnet del alumno a eliminar:");
        Scanner entrada = new Scanner(System.in);
        buscar = entrada.nextLine();
        if(EstudiantesMap.containsKey(buscar)){
            EstudiantesMap.remove(buscar);
            System.out.println("Alumno eliminado exitosamente.\n");
        }else{
            System.out.println("Alumno no encontrado, no se puede eliminar.\n");
        }
    }
}
