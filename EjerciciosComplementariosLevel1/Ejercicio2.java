package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        /* 
        Realizar un programa que solicite por consola 2 números enteros. 
        Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
        */

        // imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números
        System.out.println("Ingrese consola 2 números enteros");

        // imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;

        c = a + b; 
        System.out.println("Suma de "+ a + " y " + b + " : " + c);
         

        c = a - b;
        System.out.println("Resta de "+ a + " y " + b + " : " + c);

        c = a * b;
        System.out.println("Multiplicacion de "+ a + " y " + b + " : " + c);

        if (b != 0){
            c = a/b;
        } 

        System.out.println("Division de "+ a + " y " + b + " : " + c);

        if (b != 0){
            c = a % b;
        } 
        System.out.println("Modulo de "+ a + " y " + b + " : " + c);


        scan.close();




    }      
    
}