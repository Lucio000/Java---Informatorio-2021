package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        /* 
        Se desea una aplicación que solicite 2 números enteros y 
        realice la operación de potencia (sin uso de librerías)

        */

        // Se solicita 2 números enteros
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scan.nextInt();
        System.out.println("Ingrese la potencia: ");
        int potencia = scan.nextInt();
        

        int resultado = 1;

        // Se realiza la operación de potencia

        for ( int i = 1; i <= potencia; i++){

            resultado = resultado * numero;
        }
        
        System.out.println("El resultado de la operacion es  : " + resultado);
    
        scan.close();
    }
}