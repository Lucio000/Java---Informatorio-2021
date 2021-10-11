package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        /* 
        Confeccionar un programa que dado un número entero como dato de entrada 
        imprima la secuencia de números (incrementos de 1)
        */

        // solicite por consola un número entero
        System.out.println("Ingrese por consola un número entero");

        // imprima la secuencia de números (incrementos de 1)

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String c = "";

        for ( int i = 1; i <= a; i++){

            c = c + i;
            System.out.println(c);
            
        }
    
        scan.close();




    }      
    
}