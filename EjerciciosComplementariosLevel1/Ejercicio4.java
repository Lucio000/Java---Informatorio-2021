package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        /* 
        Realizar un programa que calcule el factorial de un número: n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
        Sin hacer uso de librerías.
        */

        // Se solicita numero
        System.out.println("Ingrese un numero: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c = 1;

        // Se realiza el factorial

        for ( int i = 1; i <= a; i++){

            c = c * i;
        }

        System.out.println("El factorial de "+ a + " es : " + c);
    
        scan.close();




    }      
    
}