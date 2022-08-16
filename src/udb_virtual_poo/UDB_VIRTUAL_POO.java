package udb_virtual_poo;

import java.util.Scanner;

public class UDB_VIRTUAL_POO {

    public static void main(String[] args) {
        // variables de entrada
        Scanner entrada = new Scanner(System.in);
        int opcion;
   
        do{
            //entrada de datos
        System.out.print("Bienvenido a UDB Virtual\n");
        System.out.print("Por favor, ingrese una opcion del menú:\n");
        opcion = entrada.nextInt();
        
         //opciones del menu
        switch(opcion){
            case 1: System.out.println("Selecciono la opcion "+opcion);
            System.out.print("Desea continuar??:\n");
            System.out.print("Digite 1 para seguir y 4 para salir:\n");
            opcion = entrada.nextInt();
            if(opcion==4){
                System.err.println("Gracias por usar el programa!!!");
                System.exit(0);
            }
            break;
            case 2: System.out.println("Selecciono la opcion "+opcion); 
            break;
            case 3: System.out.println("Selecciono la opcion "+opcion); 
            break;
        default: System.out.println("La opcion ingresada es incorrecta: "+opcion);
        }}while(opcion!=4);
    }
}
