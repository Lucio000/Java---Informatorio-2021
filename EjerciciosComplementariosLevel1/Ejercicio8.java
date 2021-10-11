package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        /* 
        Crear una aplicación que solicite de entrada los datos de una persona en este orden:
        Nombre y Apellido
        Edad
        Dirección
        Ciudad
        Luego imprimirá el siguiente mensaje:
        {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
        */

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese nombre y apellido: ");
        String nombreYApellido = scan.nextLine();

        System.out.println("Ingrese edad: ");
        String edad = scan.nextLine();

        System.out.println("Ingrese direccion: ");
        String direccion = scan.nextLine();

        System.out.println("Ingrese edad: ");
        String ciudad = scan.nextLine();

        
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreYApellido );
    
        scan.close();
    }
}