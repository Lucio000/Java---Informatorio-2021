package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        /* 
        Se desea una aplicación que solicite 2 números enteros y realice la operación 
        de multiplicación por sumas sucesivas (sin uso de librerías).
        */

        // Se solicita 2 números enteros
        System.out.println("Ingrese dos números enteros: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = 0;

        // Se realiza la operación de multiplicación por sumas sucesivas

        for ( int i = 1; i <= a; i++){

            c = c + b;
        }

        System.out.println("el producto mediante sumas es : " + c);
    
        scan.close();
    }
}