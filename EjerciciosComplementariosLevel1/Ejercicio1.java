package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        /* Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!” */

        // Solicitar por consola el nombre del usuario
        System.out.println("Ingrese nombre del usuario");

        // imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        System.out.println("HOLA "+ a + "!!!");
        scan.close();




    }      
    
}